package unit;

import org.testng.annotations.Test;

import entities.Abonne;
import entities.Conseiller;

public class ModifAdresseTest {
	
	@Test
	public void UnAbonneAvecAdressePrincileActiveEnFrance() {}
	
	@Test
	public void ConseillerConnecteModfieAdresseAvecOuSansCondition() {	
		Conseiller conseillerConnect = new Conseiller("FACE");
		Abonne abonneAModifier = new Abonne("inactive", "France");
		String condition = "Sans effet";
		//new ModifAdresse().handle(conseillerConnect, abonneAModifier, condition);
		//assertEquals(actual, expected);			
	}
}
