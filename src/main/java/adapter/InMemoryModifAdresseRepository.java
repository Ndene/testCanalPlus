package adapter;

import java.util.LinkedHashSet;
import java.util.Set;

import repositories.ModifAdresseRepository;
import usecases.ModifAdresse;

public class InMemoryModifAdresseRepository implements ModifAdresseRepository {
	
	private final Set<ModifAdresse> modifAdresses = new LinkedHashSet<>();

	public void add(ModifAdresse modifAdresse) {
		modifAdresses.add(modifAdresse);
	
	}

}
