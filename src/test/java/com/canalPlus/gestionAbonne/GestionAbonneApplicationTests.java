package com.canalPlus.gestionAbonne;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@SpringBootTest
@CucumberOptions(
		plugin = {"pretty", "html:FeaturesReport"},
		features = {"src/test/ressources/features"},
		glue = "stepdefinition"
)
class GestionAbonneApplicationTests extends AbstractTestNGCucumberTests  {

	

}
