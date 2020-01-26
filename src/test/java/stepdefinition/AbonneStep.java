package stepdefinition;

import entities.Abonne;
import io.cucumber.java.en.Given;
import repositories.AbonneRepository;
import repositories.ContratRepository;



public class AbonneStep {
	
	private AbonneRepository abonneRepository;
	
	private ContratRepository contratRepository;
	
	public AbonneStep() {}

	public AbonneStep(AbonneRepository abonneRepository) {
		this.abonneRepository = abonneRepository;
	}

	@Given("un abonné avec une adresse principale {string} en {string}")
	public void un_abonné_avec_une_adresse_principales_inactive_en_France(String active, String pays) {
		Abonne abonne = new Abonne(active, pays );
		abonneRepository.add(abonne);
		
	    throw new cucumber.api.PendingException();
	}
	
	
	
	
}
