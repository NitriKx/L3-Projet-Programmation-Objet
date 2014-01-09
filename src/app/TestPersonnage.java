package app;
import individu.Element;
import individu.Personne;
import interfaceGraphique.IHM;

import java.rmi.RemoteException;
import java.util.Random;

import serveur.Arene;
import controle.Console;

/**
 * Test de la {@link Console} avec un {@link Element} qui s'ajoute à l'{@link Arene} (apres lancement
 * {@link Arene} et {@link IHM}). A lancer en plusieurs exemplaires.
 */
public class TestPersonnage {

	/**
	 * @param args
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws RemoteException {
		Personne n = new Personne("Personne", 0, 0, 0, 0);
		new Console(n, new Random().nextInt(IHM.tailleAreneX), new Random().nextInt(IHM.tailleAreneY), TestServeur.port);
	}

}
