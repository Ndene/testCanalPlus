package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import adapter.InMemoryAbonneRepository;
import adapter.InMemoryContratRepository;
import adapter.InMemoryModifAdresseRepository;
import adapter.InMemoryModificationRepository;
import repositories.AbonneRepository;
import repositories.ContratRepository;
import repositories.ModifAdresseRepository;
import repositories.ModificationRepository;

@Configuration
public class RepositoriesConfiguration {
	
	@Bean
	@Scope("cucumber-glue")
	public AbonneRepository abonneRepository() {return new InMemoryAbonneRepository();}
	
	@Bean
	@Scope("cucumber-glue")
	public ContratRepository contratRepository() {return new InMemoryContratRepository();}
	
	@Bean
	@Scope("cucumber-glue")
	public ModifAdresseRepository modifAdresseRepository() {return  new InMemoryModifAdresseRepository();}
	
	@Bean
	@Scope("cucumber-glue")
	public ModificationRepository modificationRepository() {return  new InMemoryModificationRepository();}
	

}
