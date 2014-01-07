import individu.*;

import java.rmi.RemoteException;
import java.util.Random;

import serveur.Arene;
import controle.Console;

/**
 * Test de la Console avec un Element qui s'ajoute a l'Arene (apres lancement Arene et IHM). A lancer en plusieurs exemplaires.
 */
public class TestKnight {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		Knight k = new Knight();
		new Console(k, new Random().nextInt(Arene.tailleAreneX), new Random().nextInt(Arene.tailleAreneY));		
	}

}