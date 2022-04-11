package soup1;

public class Carrot {
	
	private Double poids;
	private Integer longueur;
	
	public Carrot(Double poids, Integer longueur) {
		this.poids = poids;
		this.longueur = longueur;
	}
	
	public Double getPoids() {
		return poids;
	}
	
	public void setPoids(Double poids) {
		
		this.poids = poids;
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
}
