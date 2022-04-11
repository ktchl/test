package soup3;

import java.util.ArrayList;
import java.util.List;

public class Soup extends Vegetable implements Quantifiable {

	List<Vegetable> mylist = new ArrayList<Vegetable>();

	
	public void add(Vegetable vegetable) {
		
		mylist.add(vegetable);
	}
	
	public String toString() {
		String result1 = "Soupe \n ----- \n" + getCalories()+ "\n" + mylist.toString();
		
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

	@Override
	public Integer getCalories() {
		Integer caloriesTotal = 0;
		for(Vegetable v : mylist) {
			
			caloriesTotal += v.getCalories();
		}
		// TODO Auto-generated method stub
		return caloriesTotal;
	}

	

	

}
