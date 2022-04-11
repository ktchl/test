package soup3;

public class Carrot extends Vegetable implements Quantifiable {
	
	
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
		
		String result = "Carotte: ["+ getCalories() + " calories - " + getPoids() +" kg - "+getLongueur()+" cm]";
		
		return result ;
		
		
	}

	@Override
	public Double getPeelingWeight() {
		
		super.poidsEpluchure = super.poids * super.epluchure;
		// TODO Auto-generated method stub
		return poidsEpluchure;
	}

	@Override
	public Integer getCalories() {
		Integer calories = 0;
		calories = (int) (((super.poids- this.getPeelingWeight() )* 40) / (0.1)) ;
		// TODO Auto-generated method stub
		return calories;
	}

	
}
