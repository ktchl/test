package soup3;

public class Test {

	public static void main(String[] args) {
		Potatoe p1 = new Potatoe(0.3,10);
		System.out.println(p1.getCalories());
		Carrot c1 = new Carrot(0.25,30);
		System.out.println(c1.getCalories());
		Soup s = new Soup();
		s.add(p1);
		s.add(c1);
		System.out.println(s.getCalories());
		
		System.out.println(p1);
		System.out.println(c1);
		System.out.println(s);
		System.out.println("\n \n");
		System.out.println("Les quantifiables: ");
		Quantifiable quantifiables[] = {p1,c1,s};
		for(Quantifiable quantifiable : quantifiables) {
			
			System.out.println(quantifiable);
		}
		// TODO Auto-generated method stub

	}

}
