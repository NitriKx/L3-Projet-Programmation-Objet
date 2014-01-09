package app;
import individu.Mineur;
import interfaceGraphique.IHM;

import java.rmi.RemoteException;
import java.util.Random;

import serveur.Arene;
import controle.Console;

/**
 * Lance un {@link Mineur} dans une {@link Arene}
 */
public class TestMineur {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		new Console(new Mineur(), new Random().nextInt(IHM.tailleAreneX), new Random().nextInt(IHM.tailleAreneY), TestServeur.port);		
	}

}