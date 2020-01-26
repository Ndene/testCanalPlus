package adapter;

import java.util.LinkedHashSet;
import java.util.Set;

import entities.Abonne;
import repositories.AbonneRepository;

public class InMemoryAbonneRepository implements AbonneRepository  {
	
	private final Set<Abonne> abonnes = new LinkedHashSet<>();
	
	public void add(Abonne abonne) {	
		abonnes.add(abonne);
	}

	@Override
	public void all() {}
	
	

}
