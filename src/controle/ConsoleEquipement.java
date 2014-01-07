package controle;

import individu.Element;
import interfaceGraphique.VueElement;

import java.awt.Point;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import serveur.IArene;

/**
 * 
 * Se connecte au serveur avec un Element et sa VueElement.
 * "run" permet a l'Element/VueElement de se deplacer
 *
 */
public class ConsoleEquipement extends UnicastRemoteObject implements IConsole {
	
	private static final long serialVersionUID = 1L;
	private static final int port=5099;	              //port par defaut pour communiquer avec le serveur RMI
	private Remote serveur = null;                    //le serveur avec lequel le controleur communique
	private VueElement ve = null;                     //la vue de l'element (pour l'interface graphique)
	private Element elem = null;                      //l'element pour lequel le controleur est cree
	private int refRMI;                               //la reference (entiere) attribuee par le serveur a la connexion
	
	
	/**
	 * Constructeur
	 * @param elem l'element pour lequel le controleur est cree
	 * @param dx la position initiale de l'element sur l'ordonnee (interface graphique)
	 * @param dy la position initiale de l'element sur l'abscisse (interface graphique)
	 * @throws RemoteException
	 */
	public ConsoleEquipement(Element elem, int dx, int dy) throws RemoteException {
		 //appel au constructeur de la super-classe -> il peut etre implicite
		super();
		try{
			//initialisation de l'element pour lequel le controleur est cree
			this.elem=elem;
			
			//preparation connexion au serveur
			//handshake/enregistrement RMI
			serveur=Naming.lookup("rmi://localhost:"+port+"/Arene");
			serveur.toString();
			
			//initialisation de la reference du controleur sur le serveur
			this.refRMI=((IArene) serveur).allocateRef();
			Naming.rebind("rmi://localhost:"+port+"/Console"+refRMI,this);
			
			//initialisation de la vue sur l'element
			ve=new VueElement(refRMI, new Point(dx, dy), this, "Atterrissage...", elem);
						
			//connexion au serveur
			((IArene) serveur).connect(ve);
			
			//affiche message si succes
			System.out.println("Console connectee ["+refRMI+"]");
 		} catch (Exception e) {
  			System.out.println("Erreur : la console n'a pa pu etre creee !\nCause : "+e.getCause());
  			e.printStackTrace();
 		}
	}


	/**
	 * Permet au serveur de faire "jouer" un tour a l'element.
	 * Calcule ses voisins (donnes par le serveur), cherche le plus proche, s'il est a proximite, lance l'interaction sinon se dirige vers lui (s'il existe un plus proche)
	 * Cette methode est execute chaque seconde  
	 */
	public void run() throws RemoteException {
		//decremente sa duree de vie
		// ve.decrTTL(); 
	}
	
	/**
	 * Deplace ce sujet d'une case en direction du sujet dont la reference est donnee en parametre
	 * @param ref la reference de l'element cible
	 */
	public void seDirigerVers(int ref) {
	}

	/**
	 * Appelle par le serveur pour faire la MAJ du sujet 
	 */
	public VueElement update() throws RemoteException {
		VueElement aux=(VueElement) ve.clone();
		aux.setPhrase(ve.getPhrase()); 
		return aux;
	}

	/**
	 * Deconnexion du controleur du serveur
	 * @param cause le message a afficher comme cause de la deconnexion
	 */
	public void shutDown(String cause) throws RemoteException {
		System.out.println("Console "+refRMI+" deconnectee : "+cause);
//		System.exit(1);
	}

	public Element getElement() throws RemoteException {
		return elem;
	}
	
	public VueElement getVueElement() throws RemoteException {
		return ve;
	}
	
	public void parler(String s) throws RemoteException {
		ve.setPhrase(s);	
	}
	

	public void perdreVie(int viePerdue) throws RemoteException {
		this.elem.setVie(this.elem.getVie()-viePerdue);
	}
	
	public void ramasserObjet(IConsole objet) throws RemoteException {
	}
	
	public String afficher() throws RemoteException{
		return this.elem.toString();
	}

	/**
	 * Ajout l'element dans la liste des elements connus (combattants et equipements)
	 * @param ref l'element a ajouter
	 */
	public void ajouterConnu(int ref) throws RemoteException {
	}
		
}
