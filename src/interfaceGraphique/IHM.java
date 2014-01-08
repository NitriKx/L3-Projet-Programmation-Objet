package interfaceGraphique;

import individu.Personne;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import serveur.IArene;

public class IHM extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int port=5099;	                              //port par defaut pour communiquer avec le serveur RMI
	enum State{INIT,PLAYING};
	private State state=State.INIT;                                   //etat de l'interface
	private Remote serveur;                                           //serveur
	private Thread connection = null;                                 //thread de connexion au serveur
	private boolean cnxError = false;                                 //erreur de connexion
	private ArrayList<VueElement> world=new ArrayList<VueElement>();  //liste de tous les elements connectes a l'interface
	
	public static final int tailleAreneX = 100;
	public static final int tailleAreneY = 100;
	
	private static final String ELEMENT_IMG_BASE_DIRECTORY = "assets/img";
	
	private class AreneJTextArea extends JTextArea {

		private static final long serialVersionUID = 1L;

		AreneJTextArea() {
			super("Connexion...",10,10);
			setEditable(false);
		}
	}
	
	private class AreneJPanel extends JPanel {
		private Dimension preferredSize = new Dimension(400, 400);
		
		private static final long serialVersionUID = 1L;
		private JTextArea jta;
		
		//Conteneur qui affiche l'arene de jeu
		AreneJPanel(JTextArea jta) {
			this.jta=jta;
			setMinimumSize(preferredSize);
		    addMouseWheelListener(new MouseWheelListener() {
		        public void mouseWheelMoved(MouseWheelEvent e) {
		            updatePreferredSize(e.getWheelRotation(), e.getPoint());
		        }
		    });
		}
		
		private void updatePreferredSize(int n, Point p) {
		    double d = (double) n * 1.08;
		    d = (n > 0) ? 1/d : -d;

		    int w = (int) (getWidth() * d);
		    int h = (int) (getHeight() * d);
		    preferredSize.setSize(w, h);

		    int offX = (int)(p.x * d) - p.x;
		    int offY = (int)(p.y * d) - p.y;
		    setLocation(getLocation().x-offX,getLocation().y-offY);
//		    getParent().doLayout(); Méthode dépréciée
		    getParent().validate();
		    
		}
		
		public Dimension getPreferredSize() {
		    return preferredSize;
		}
		
		public void paintComponent(Graphics g) {
			Graphics2D g2=(Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			//affiche l'arene comme un rectangle
			Rectangle rect=this.getBounds();
			
			drawGridAndBackground(g2);
			
			
			
			//si la connexion est en cours ou il y a une erreur
			if ((state==State.INIT) || (cnxError)) {
				g2.setFont(new Font("Verdana",Font.BOLD,12));
				//affiche le message correspondant
				if (!cnxError) 
					g2.drawString("Connexion en cours sur le serveur Arene...",20, rect.height-20);
				else 
					g2.drawString("Erreur de connexion !",20, rect.height-20);
				// g.setFont(of);
				
				//verifie si la connexion a ete realisee - isAlive (Thread)==true si on est en cours de connexion
				if ((connection!=null) && (! connection.isAlive())) {
					//affiche le message correspondant
					if (!cnxError) 
						jta.append("ok !"); 
					else 
						jta.append("erreur !");
					//mets a jour l'etat de l'arene
					state=State.PLAYING;
					//remets la connexion a null pour une autre execution
					connection=null;
				}
			} 
			else {
				try {
					//mets a jour la liste des elements en vie sur l'arene
					world=((IArene) serveur).getWorld();
					
					int cx,cy;
					String dial;
					
					//reinitialise l'affichage de l'arene
					jta.setText("");
					
					//pour chaque element en vie sur l'arene
					for(VueElement s:world) {
						
//						Random r=new Random(ref);
//						Color vueElementColor = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255), 200);
//						//calcule une couleur pour la representation
//						g.setColor(vueElementColor);
						
						//recupere les coordonnes de l'element
						int ratioX = rect.width/tailleAreneX;
						int ratioY = rect.height/tailleAreneY;
						
						cx=s.getPoint().x*rect.width/tailleAreneX;
						cy=s.getPoint().y*rect.height/tailleAreneY;
						
						//recupere les phrases dites par l'element
						dial=(s.getPhrase()==null)?"":" : "+s.getPhrase();
						
						// Dessine propremet les information relatives à un personnage
						try {
							drawInformationsAndElementBackground(g2, (cx+ratioX/2)-16, (cy+ratioY/2)-16, s, true);
							drawImageForElement(g2, (cx+ratioX/2)-16, (cy+ratioY/2)-16, s);
						} catch (IOException e) {
							//construis un oval aux coordonnes cx,cy de taille 8 x 8
							g2.fillOval((cx+ratioX/2)-16,(cy+ratioY/2)-16,8,8);
						}
						
						//affiche dans la fenetre a cote ses informations
						jta.append(s.afficher()+dial+"\n");
					}
					
				} 
				catch (RemoteException e) {
					//en cas de deconnexion ou erreur du serveur
					//remets l'etat de l'arene a jour
					state=State.INIT;
					//affiche un dialog avec le message d'erreur
					JOptionPane.showMessageDialog(this,"Erreur de connection !\nRaison : "+e.getMessage(),"Message",JOptionPane.ERROR_MESSAGE);
					cnxError=true;
					e.printStackTrace();
				}
			}
			
			//affiche l'heure courante
			g2.setColor(Color.WHITE);
			g2.drawString(DateFormat.getTimeInstance().format(new Date()),rect.width-60,20);
		}
		
		/**
		 * Dessine l'image correspondant à un élément
		 * @param graphics
		 * @param cx
		 * @param cy
		 * @param vueElement
		 * @throws IOException
		 */
		private void drawImageForElement(Graphics graphics, int cx, int cy, VueElement vueElement) throws IOException {
			BufferedImage img = ImageIO.read(new File(ELEMENT_IMG_BASE_DIRECTORY + "/" + vueElement.getControleur().getElement().getPictureFileName()));
			graphics.drawImage(img, cx, cy, null);
		}
		
		/**
		 * 
		 * @param graphics
		 * @param cx
		 * @param cy
		 * @param vueElement
		 * @param vueElementColor
		 * @param left
		 * @throws RemoteException 
		 */
		private void drawInformationsAndElementBackground(Graphics2D graphics, int cx, int cy, VueElement vueElement, boolean right) throws RemoteException {
			// Dessine un cadre autour de l'icône
			graphics.setColor(Color.BLACK);
			graphics.fillOval(cx-8, cy-8, 47, 47);
			
			graphics.setColor(Couleur.getBlendedColor(Balance.getBalance(vueElement.getControleur().getElement())));
			graphics.fillOval(cx-6, cy-6, 43, 43);
			
			// On dessine une légende si c'est un personnage (chaque image fait 32px par 32px)
			if(Personne.class.isAssignableFrom(vueElement.getControleur().getElement().getClass())) {
				graphics.setColor(Color.WHITE);
				graphics.drawLine(cx+28, cy-4, cx+34, cy-11);
				graphics.drawLine(cx+34, cy-11, cx+42, cy-11);
				
				// Affiche au dessus du point son nom
				graphics.setFont(new Font("Verdana", Font.BOLD, 12));
				graphics.drawString(vueElement.afficher(), cx+44, cy-6);
				
				// Affiche en dessous ses points de vie
				graphics.setFont(new Font("Arial Black", Font.BOLD, 9));
				graphics.setColor(Color.BLACK);
				graphics.drawString("" + vueElement.getControleur().getElement().getVie(), cx+8 + (3 - ("" + vueElement.getControleur().getElement().getVie()).length()), cy+35);
			}

		}
		
		private void drawGridAndBackground(Graphics g) {
			Rectangle rect=this.getBounds();
			float widthCase = (float) rect.width/(float) 100.0;
			float heightCase = (float) rect.height/(float) 100.0;
			
			// Draw the background
			try {
				Image background = ImageIO.read(new File(ELEMENT_IMG_BASE_DIRECTORY + "/floor.png"));
				int backgroundWidth = background.getWidth(null);
				int backgroundHeight = background.getHeight(null);
				
				for(int x = 0; x < rect.width; x += backgroundWidth) {
					for(int y = 0; y < rect.height; y += backgroundHeight) {
						g.drawImage(background, x, y, null);
					}
				}
			} catch (IOException e) {
				// In case of error the background will be the default one
			}
			
			// Draw the grid
			g.setColor(Color.GRAY);
			for(float x = 0; x < rect.width; x += widthCase) {
				g.drawLine((int) x, 0, (int) x, rect.height);
			}
			
			for(float y = 0; y < rect.height; y += heightCase) {
				g.drawLine(0, (int) y, rect.width, (int) y);
			}
			
		}
	}
	
	public IHM() {
		Toolkit kit=Toolkit.getDefaultToolkit();
		
		//personnalise et positionne la fenetre par rapport a l'ecran
//		Dimension size=kit.getScreenSize();
//		setSize(size.width/2, size.height/2);
		Dimension size=kit.getScreenSize();
//		setSize(400, 400);
		setLocation(size.width, size.height/4);
		//setResizable(false);
		
		//cree un titre de la fenetre
		setTitle("IHM - Arene / UPS - Projet Prog");
		
		// On change l'icone de l'application
		try {
			setIconImage(ImageIO.read(new File(ELEMENT_IMG_BASE_DIRECTORY + "/icon.png")));
		} catch (IOException e) {
			// On ignore l'erreur - On aura l'icone de base
		}
		
		//ajout une operation si le bouton de fermeture de la fenetre est clique
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ajout d'une action pour arreter l'execution de l'interface graphique
		Action exitAction=new AbstractAction("Quitter") {
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		};
		
		Action aboutAction=new AbstractAction("A propos") {
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent ae) {
				JOptionPane.showMessageDialog(null,"Arene\nInspiree des TP de L3");
			}
		};
		
		//creation d'un menu Fichier avec deux options - quitter et a propos 	
		JMenuBar m=new JMenuBar();
		JMenu file=new JMenu("Fichier");
		file.add(aboutAction);
		file.add(exitAction);
		m.add(file);
		setJMenuBar(m);
		
		//ajout de l'arene dans la fenetre
		AreneJTextArea ajta=new AreneJTextArea();
		AreneJPanel ajpl = new AreneJPanel(ajta);
		
		getContentPane().add(new JScrollPane(ajpl));
		pack();
		setMinimumSize(getSize());
		setVisible(true);
		
		//Fenetre qui affiche les messages des console
		JFrame jf=new JFrame();
		jf.setSize(size.width/4, size.height/4);
		jf.setMinimumSize(jf.getSize());
		jf.setLocation(size.width*3/5, size.height/10);
		jf.getContentPane().add(new JScrollPane(ajta));
		jf.setTitle("Asteroide325 - Console");
		jf.setVisible(true);
	}
	
	/**
	 * Lance une connexion au serveur dans un thread separe
	 */
	public void connect() {
		connection=new Thread() {
			public void run() {
				try {
					serveur=Naming.lookup("rmi://localhost:"+port+"/Arene");
				} 
				catch (Exception e) {
					cnxError=true;
					JOptionPane.showMessageDialog(null,"Impossible de se connecter au serveur Arene:"+port+" !\n(le serveur ne doit pas etre actif...)\nRaison : "+e.getMessage(),"Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		};
		connection.start();
	}
}
