package app;
import individu.ApparitionEquipements;
import individu.Equipement;

/**
 * Fait apparaitre plusieurs {@link Equipement} (un par thread) à un intervalle régulier défini
 */
public class TestEquipements {

	public TestEquipements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ApparitionEquipements(10000).start();
	}

}
