package repositories;

import java.util.Set;

import entities.Abonne;
import entities.Contrat;


public interface ContratRepository {
	
	Contrat getContrat(Abonne Abonne);

	void add(Contrat contrat);

	static Set<Contrat> all() {
		
		return null;
	}

	

}
