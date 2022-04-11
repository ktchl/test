package soup2;

public class Carrot extends Vegetable {
	
	
	private Integer longueur;
	
	public Carrot(Double poids, Integer longueur) {
		super.poids = poids;
		this.longueur = longueur;
	}
	
	public Double getPoids() {
		return poids;
	}
	
	public void setPoids(Double poids) {
		
		super.poids = poids;
	}
	
	public Integer getLongueur() {
		return longueur;
	}
	
	public void setLongueur(Integer longueur) {
		
		this.longueur = longueur;
	}
	
	public String toString() {
		
		String result = "Carotte: ["+ getPoids() +" kg - "+getLongueur()+" cm]";
		
		return result ;
		
		
	}

	@Override
	public Double getPeelingWeight() {
		
		super.poidsEpluchure = super.poids * super.epluchure;
		// TODO Auto-generated method stub
		return poidsEpluchure;
	}

	
}
