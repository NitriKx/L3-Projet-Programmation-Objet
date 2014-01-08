import individu.Assassin;
import interfaceGraphique.IHM;

import java.rmi.RemoteException;
import java.util.Random;

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
		new Console(ass1, new Random().nextInt(IHM.tailleAreneX), new Random().nextInt(IHM.tailleAreneY), TestServeur.port);
		
//		Barbare bar1 = new Barbare();
//		new Console(bar1, new Random().nextInt(Arene.tailleAreneX), new Random().nextInt(Arene.tailleAreneY));
//		
//		Mineur min = new Mineur();
//		new Console(min, new Random().nextInt(Arene.tailleAreneX), new Random().nextInt(Arene.tailleAreneY));
//		
//		Knight k = new Knight();
//		new Console(k, new Random().nextInt(Arene.tailleAreneX), new Random().nextInt(Arene.tailleAreneY));
//		
//		Ninja n = new Ninja();
//		new Console(n, new Random().nextInt(Arene.tailleAreneX), new Random().nextInt(Arene.tailleAreneY));
		
	}

}
