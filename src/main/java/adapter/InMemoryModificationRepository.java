package adapter;

import java.util.LinkedHashSet;
import java.util.Set;

import entities.Modification;
import repositories.ModificationRepository;

public class InMemoryModificationRepository implements ModificationRepository{
	
	private final Set<Modification> modifs = new LinkedHashSet<>();

	@Override
	public void add(Modification modification) {
		modifs.add(modification);
		
		
	}

	@Override
	public Set<Modification> all() {
		return modifs;
	}

}
