package entities;

public class Abonne {
	
	private String active;
	private String pays;
	
	
	public void setActive(String active) {
		this.active = active;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Abonne(String active, String pays) {
		this.active = active;
		this.pays = pays;
	}


	public String toString() {
		return "Abonne [active=" + active + ", pays=" + pays + "]";
	}

	
	
	
	

}
