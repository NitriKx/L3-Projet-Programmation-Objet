import individu.Assassin;
import individu.Barbare;

import java.rmi.RemoteException;
import java.util.Random;

import serveur.Arene;

import controle.Console;

/**
 * Test de la Console avec un Element qui s'ajoute a l'Arene (apres lancement Arene et IHM). A lancer en plusieurs exemplaires.
 */
public class TestConsole {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		Assassin ass1 = new Assassin();
		new Console(ass1, new Random().nextInt(Arene.tailleAreneX), new Random().nextInt(Arene.tailleAreneY));
		
		Barbare bar1 = new Barbare();
		// new Console(bar1, new Random().nextInt(Arene.tailleAreneX), new Random().nextInt(Arene.tailleAreneY));
	}

}
