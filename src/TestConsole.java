import individu.Assassin;
import individu.Element;

import java.rmi.RemoteException;

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
		
		//Random r = new Random();
		new Console(ass1, 40, 40);
	}

}
