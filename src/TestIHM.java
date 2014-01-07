import interfaceGraphique.IHM;

/**
 * Test de l'interface graphique qui se connecte a l'Arene (apres lancement Arene, avant les Consoles)
 */
public class TestIHM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Placement des menus dans le menu-bar pour OS-X
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		// Changement du nom de l'application dans le dock OS-X
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Arène");
		
		IHM ihm=new IHM();
		ihm.connect();
		//boucle infine, interrompue par l'utilisateur (IHM)
		while(true) {
			try {Thread.sleep(500);} catch (InterruptedException e) {}
			ihm.repaint(); 
		}
	}

}
