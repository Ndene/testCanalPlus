package repositories;

import java.util.Set;

import entities.Modification;

public interface ModificationRepository {

	void add(Modification modification);

	Set<Modification> all();

}
