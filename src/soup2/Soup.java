package soup2;

import java.util.ArrayList;
import java.util.List;

public class Soup extends Vegetable {

	List<Vegetable> mylist = new ArrayList<Vegetable>();

	
	public void add(Vegetable vegetable) {
		
		mylist.add(vegetable);
	}
	
	public String toString() {
		String result1 = "Soupe \n ----- \n" + mylist.toString();
		
		return result1;
		
	}

	@Override
	public Double getPeelingWeight() {
		
		Double poidsTotal =0.0;
		for(Vegetable v : mylist) {
			
			poidsTotal += v.getPeelingWeight();
		}
		
		
		return poidsTotal;
	}
	

	

}
