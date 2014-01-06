package interaction;

import individu.Element;
import individu.Personnage;

import java.rmi.Remote;
import java.rmi.RemoteException;

import controle.IConsole;
import serveur.Arene;

public class DuelBasic implements IDuel {

	private Arene arene;          //l'arene sur laquelle le jeu a lieu
	private Remote refAttaquant;  //la reference de l'attaquant
	private Remote refDefenseur;  //la reference du defenseur
	
	/**
	 * Constructeur
	 * @param arene l'arene du jeu
	 * @param refAttaquant la reference de l'attaquant
	 * @param refDefenseur la reference du defenseur
	 * @throws RemoteException
	 */
	public DuelBasic(Arene arene, Remote refAttaquant, Remote refDefenseur) throws RemoteException{
		this.arene = arene;
		this.refAttaquant = refAttaquant;
		this.refDefenseur = refDefenseur;
	}

	/**
	 * Realise le combat 
	 */
	public int realiserCombat() throws RemoteException {
		Remote rAtt = this.getRefAttaquant();
		IConsole cAtt = (IConsole) rAtt;
		Element elAtt = cAtt.getElement();
		
		Remote rDef = this.getRefDefenseur();	
		IConsole cDef = (IConsole) rDef;
		Element elDef = cDef.getElement();
		
		if (elAtt instanceof Personnage && elDef instanceof Personnage) {
			Personnage pAtt = (Personnage) elAtt;
			Personnage pDef = (Personnage) elDef;
			
			if (Math.random()<0.8) {
				cAtt.perdreVie(pertePDV(pAtt, pDef));
			} else {
				cDef.perdreVie(pertePDV(pDef, pAtt));
			}
		} else {
			return 0;
		}
		
//		if(vieAtt < vieDef)
//			cAtt.perdreVie(1);
//		else
//			cDef.perdreVie(1);
		
		return 0;
	}


	public Remote getRefAttaquant() throws RemoteException {
		return refAttaquant;
	}

	public Remote getRefDefenseur() throws RemoteException {
		return refDefenseur;
	}
	
	private int pertePDV(Personnage attaquant, Personnage victime) {
		float perte;
		
		perte = attaquant.getArgent() / 10;
		perte *= attaquant.getAttaque();
		perte /= victime.getDefense();
		perte += 2;
		perte += 5*Math.random();
		
		return (int) perte;
	}

}
