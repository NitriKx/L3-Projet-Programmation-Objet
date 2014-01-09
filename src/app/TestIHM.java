package app;
import controle.Console;
import serveur.Arene;
import interfaceGraphique.IHM;

/**
 * Test de l'interface graphique qui se connecte à l'{@link Arene} (apres lancement
 * {@link Arene}, avant les {@link Console})
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

		IHM ihm = new IHM();
		ihm.connect();
		// boucle infine, interrompue par l'utilisateur (IHM)
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			ihm.repaint();
		}
	}

}
