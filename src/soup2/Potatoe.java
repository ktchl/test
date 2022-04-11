package soup2;

public class Potatoe extends Vegetable {

	
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
			result = "Patate: [" + getPoids() + " kg - " + getYeux() + " oeil]";

		} else {
			result = "Patate: [" + getPoids() + " kg - " + getYeux() + " yeux]";

		}
		return result;

	}

	@Override
	public Double getPeelingWeight() {
		
		super.poidsEpluchure = super.poids * super.epluchure +( 0.01 * this.yeux);
		// TODO Auto-generated method stub
		return poidsEpluchure;
	}

}
