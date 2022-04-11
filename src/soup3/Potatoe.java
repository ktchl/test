package soup3;

public class Potatoe extends Vegetable implements Quantifiable {

	
	private Integer yeux;

	public Potatoe(Double poids, Integer yeux) {

		super.poids = poids;
		this.yeux = yeux;

	}

	public Potatoe(Double poids) {

		super.poids = poids;
		this.yeux = (int) (poids * 10);

	}

	public Double getPoids() {

		return poids;
	}

	public void setPoids(Double poids) {

		this.poids = poids;

	}

	public Integer getYeux() {

		return yeux;
	}

	public void setYeux(Integer yeux) {

		this.yeux = yeux;
	}

	public String toString() {
		String result;

		if (getYeux() == 1) {
			result = "Patate: [" +getCalories() + " calories - " + getPoids() + " kg - " + getYeux() + " oeil]";

		} else {
			result = "Patate: [" + getCalories() + " calories - " + getPoids() + " kg - " + getYeux() + " yeux]";

		}
		return result;

	}

	@Override
	public Double getPeelingWeight() {
		
		super.poidsEpluchure = super.poids * super.epluchure +( 0.01 * this.yeux);
		// TODO Auto-generated method stub
		return poidsEpluchure;
	}

	@Override
	public Integer getCalories() {
		Integer calories = 0;
		calories = (int) ((((super.poids - this.getPeelingWeight()) * 80 ) /( 0.1)) - this.yeux * 5);
		
		// TODO Auto-generated method stub
		return calories;
	}

}
