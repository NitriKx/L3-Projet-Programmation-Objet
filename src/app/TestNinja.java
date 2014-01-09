package app;
import individu.Ninja;
import interfaceGraphique.IHM;

import java.rmi.RemoteException;
import java.util.Random;

import serveur.Arene;
import controle.Console;

/**
 * Lance un {@link TestNinja} dans une {@link Arene}
 */
public class TestNinja {

	/**
	 * @param args
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws RemoteException {
		new Console(new Ninja(), new Random().nextInt(IHM.tailleAreneX), new Random().nextInt(IHM.tailleAreneY), TestServeur.port);
	}

}
