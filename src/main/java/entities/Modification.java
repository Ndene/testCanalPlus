package entities;

public class Modification {
	
	private String canal;
	private String active;
	private String pays;
	private String condition;
	
	public Modification(String canal, String active, String pays, String condition) {
		super();
		this.canal = canal;
		this.active = active;
		this.pays = pays;
		this.condition = condition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + ((canal == null) ? 0 : canal.hashCode());
		result = prime * result + ((condition == null) ? 0 : condition.hashCode());
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modification other = (Modification) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (canal == null) {
			if (other.canal != null)
				return false;
		} else if (!canal.equals(other.canal))
			return false;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Modification [canal=" + canal + ", active=" + active + ", pays=" + pays + ", condition=" + condition
				+ "]";
	}
	
	

	
}
