package adapter;

import java.util.LinkedHashSet;
import java.util.Set;

import entities.Abonne;
import entities.Contrat;
import repositories.ContratRepository;


public class InMemoryContratRepository implements ContratRepository {
	private final Set<Contrat> contrats = new LinkedHashSet<>();
	
	public Contrat getContrat(Abonne Abonne) {
	
		return null;
	}

	public void add(Contrat contrat) {
		contrats.add(contrat);
		
	}

}
