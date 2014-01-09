package interfaceGraphique;

import individu.Personne;

/**
 * Interface à intégrer à une classe héritée de {@link Personne} pour avoir une icone sur l'{@link IHM}
 */
public interface IAfficheImage {
	
	/**
	 * @return Le nom complet du fichier représentant la class
	 */
	public String getPictureFileName();
	
}
