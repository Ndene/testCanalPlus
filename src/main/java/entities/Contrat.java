package entities;

public class Contrat {
	
	private String active;
	private String pays;
	
	
	public String getActive() {
		return active;
	}


	public String getPays() {
		return pays;
	}

	public Contrat(String active, String pays) {
		this.active = active;
		this.pays = pays;
	}
	
	

}
