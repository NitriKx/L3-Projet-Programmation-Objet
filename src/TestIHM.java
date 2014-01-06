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

		IHM ihm=new IHM();
		ihm.connect();
		//boucle infine, interrompue par l'utilisateur (IHM)
		while(true) {
			try {Thread.sleep(500);} catch (InterruptedException e) {}
			ihm.repaint(); 
		}
	}

}
