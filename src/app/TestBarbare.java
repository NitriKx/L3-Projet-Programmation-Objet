package app;
import individu.Barbare;
import interfaceGraphique.IHM;

import java.rmi.RemoteException;
import java.util.Random;

import serveur.Arene;
import controle.Console;

/**
 * Lance un {@link TestBarbare} dans une {@link Arene}
 */
public class TestBarbare {

	/**
	 * @param args
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws RemoteException {
		new Console(new Barbare(), new Random().nextInt(IHM.tailleAreneX), new Random().nextInt(IHM.tailleAreneY), TestServeur.port);
	}

}