package equipement;

import individu.Element;

import java.util.Random;

import serveur.Arene;
import controle.ConsoleEquipement;

public class ApparitionEquipements extends Thread {
	
	// private UtilitaireConsole console = new UtilitaireConsole();
	private int intervalleApparitions;
	
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
		while (true) {
			try {
				
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
				
				Thread.sleep(this.intervalleApparitions);
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
				try { Thread.sleep(this.intervalleApparitions); } catch (InterruptedException e1) {}
			}
		}
	}

}
