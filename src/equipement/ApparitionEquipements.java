package equipement;

import individu.Element;

import java.util.Random;

import serveur.Arene;
import controle.ConsoleEquipement;

public class ApparitionEquipements extends Thread {
	
	// private UtilitaireConsole console = new UtilitaireConsole();
	private int intervalleApparitions;
	
	private static final int limitConsecutiveErrors = 5;
	private static final int limitConsecutiveErrorsWaintingTime = 10000;
	
	enum ListeEquipements {
		BOTTES,
		BOUCLIER,
		CASQUE,
		EPEE,
		MASSE,
		PIECES,
		POTION
	}
	
	public ApparitionEquipements(int intervalleApparitions) {
		this.intervalleApparitions = intervalleApparitions;
	}
	
	@Override
	public void run() {
		int compteurErreur = 0;
		while (true) {
			try {
				
				// On attend un certain temps si on a trop d'erreurs consécutives
				if(compteurErreur >= limitConsecutiveErrors) {
					System.out.println("Trop d'erreurs. On attend avant de faire apparaitre davantages d'objets");
					Thread.sleep(limitConsecutiveErrorsWaintingTime);
					compteurErreur = 0;
				}
				
				int randomX = (int)(Math.random() * Arene.tailleAreneX);	// on tire l'abscisse d'une position au hasard
				int randomY = (int)(Math.random() * Arene.tailleAreneY);	// on tire l'ordonnee d'une position au hasard
				
				ListeEquipements equipementPossibles[] = ListeEquipements.values();
				ListeEquipements equipementAFaireApparaitre = equipementPossibles[new Random().nextInt(equipementPossibles.length)];
				Element element = null;
				switch(equipementAFaireApparaitre) {
				case BOTTES :
					element = new Bottes();
					break;
				case BOUCLIER :
					element = new Bouclier();
					break;
				case CASQUE :
					element = new Casque();
					break;
				case EPEE:
					element = new Epee();
					break;
				case MASSE :
					element = new Masse();
					break;
				case PIECES :
					element = new Pieces();
					break;
				case POTION:
					element = new Potion();
					break;
				default:
					break;
				}
				
				new ConsoleEquipement(element, randomX, randomY);
				compteurErreur = 0;
				
				Thread.sleep(this.intervalleApparitions);
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
				// Si une erreur se produit, on recommence l'ajout d'un objet
				compteurErreur++;
			}
		}
	}

}
