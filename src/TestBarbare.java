import individu.Barbare;
import interfaceGraphique.IHM;

import java.rmi.RemoteException;
import java.util.Random;

import controle.Console;

/**
 * Test de la Console avec un Element qui s'ajoute a l'Arene (apres lancement Arene et IHM). A lancer en plusieurs exemplaires.
 */
public class TestBarbare {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		Barbare bar1 = new Barbare();
		new Console(bar1, new Random().nextInt(IHM.tailleAreneX), new Random().nextInt(IHM.tailleAreneY), TestServeur.port);		
	}

}