package usecases;

import entities.Modification;
import repositories.ModificationRepository;

public class ModifAdresse {
	
	private final ModificationRepository modificationRepository;

	public ModifAdresse(ModificationRepository modificationRepository) {
		this.modificationRepository = modificationRepository;
	}

	public void handle(String canal, String active, String pays, String condition) {
		modificationRepository.add(new Modification(canal, active, pays,condition));				
	}
	
	
	


}
