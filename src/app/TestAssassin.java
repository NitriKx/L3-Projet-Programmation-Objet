package app;
import individu.Assassin;
import interfaceGraphique.IHM;

import java.rmi.RemoteException;
import java.util.Random;

import serveur.Arene;
import controle.Console;

/**
 * Lance un {@link Assassin} dans une {@link Arene}
 */
public class TestAssassin {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		new Console(new Assassin(), new Random().nextInt(IHM.tailleAreneX), new Random().nextInt(IHM.tailleAreneY), TestServeur.port);		
	}

}

