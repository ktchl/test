package soup3;

public abstract class Vegetable implements Quantifiable {

	protected Double poids;
	protected static Double epluchure = 0.1;
	protected Double poidsEpluchure;

	public abstract Double getPeelingWeight();

	public static void setPeelingWeight(Double epluchure) {

		Vegetable.epluchure = epluchure;
	}

}
