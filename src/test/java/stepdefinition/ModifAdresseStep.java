package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import entities.Contrat;
import entities.Modification;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import repositories.AbonneRepository;
import repositories.ContratRepository;
import repositories.ModificationRepository;
import repositories.MouvModifAdresseRepository;
import usecases.ModifAdresse;

public class ModifAdresseStep {
	
	private MouvModifAdresseRepository mouvModifAdresseRepository;
	private ContratRepository contratRepository;
	private AbonneRepository abonneRepository;
	private ModificationRepository modificationRepository;
	
	//final ModifAdresse modifAdresse; 
	ModifAttempt modifAttempt;
	ContratAttempt contratAttempt;
	AbonneAttempt abonneAttempt;
		
	public ModifAdresseStep(MouvModifAdresseRepository mouvModifAdresseRepository, ContratRepository contratRepository, AbonneRepository abonneRepository, ModificationRepository modificationRepository) {
		this.mouvModifAdresseRepository = mouvModifAdresseRepository;
		this.contratRepository = contratRepository;
		this.abonneRepository = abonneRepository;
		//this.modifAdresse = new ModifAdresse();
		modifAttempt = new ModifAttempt();
		contratAttempt = new ContratAttempt();
		abonneAttempt = new AbonneAttempt();	
	}
	
	final ModifAdresse ModifAdresse = new ModifAdresse(modificationRepository);

	@When("le conseiller connecté à {string} modifie adresse de abonné {string}")
	public void le_conseiller_connecté_à_modifie_adresse_de_abonné(String canal, String condition) {
	
		this.ModifAdresse.handle(canal, abonneAttempt.active, abonneAttempt.pays, condition);
		modifAttempt.setCanal(canal);
		modifAttempt.setActive(abonneAttempt.active);
		modifAttempt.setPays(abonneAttempt.pays);
		modifAttempt.setCondition(condition);
		
		contratAttempt.setActive(abonneAttempt.active);
		contratAttempt.setPays(abonneAttempt.pays);
		contratRepository.add(new Contrat(contratAttempt.active, contratAttempt.pays));
				
	    throw new cucumber.api.PendingException();
	}
	
	@Then("adresse de l'abonné modifiée est enregistrée sur ensemble des contrats de abonné")
	public void adresse_de_l_abonné_modifiée_est_enregistrée_sur_ensemble_des_contrats_de_abonné() {
		
		
		//assertEquals(new ModifAdresse(abonneAttempt.active,abonneAttempt.pays), new ContratAttempt(contratAttempt.active,contratAttempt.pays));
		
	    throw new cucumber.api.PendingException();
	}
	
	@Then("un mouvement de modification de d'adresse est créé")
	public void un_mouvement_de_modification_de_d_adresse_est_créé() {
		
		Set<Modification> modifs = modificationRepository.all();
		assertEquals(1, modifs.size());
		assertEquals(new Modification(modifAttempt.canal, modifAttempt.active, modifAttempt.pays, modifAttempt.condition), modifs.iterator().next());
		
	    throw new cucumber.api.PendingException();
	}
		
	private static class ModifAttempt{
		private String canal;
		private String active;
		private String pays;
		private String condition;
		
		public void setCanal(String canal) {
			this.canal = canal;
		}
		public void setActive(String active) {
			this.active = active;
		}
		public void setPays(String pays) {
			this.pays = pays;
		}
		public void setCondition(String condition) {
			this.condition = condition;
		}
		
		

	}
	
	private static class ContratAttempt{
		
		private String active;
		private String pays;
		public void setActive(String active) {
			this.active = active;
		}
		
		public ContratAttempt() {

		}

		public ContratAttempt(String active, String pays) {
			this.active = active;
			this.pays = pays;
		}

		public void setPays(String pays) {
			this.pays = pays;
		}
		
	}
	
	private static class AbonneAttempt{
		
		private String active;
		private String pays;
		public void setActive(String active) {
			this.active = active;
		}
		public void setPays(String pays) {
			this.pays = pays;
		}
		
	}
}

