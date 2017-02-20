import java.util.ArrayList;
import java.util.Collections;

public class BigMoney {
	public static void main(String[] args) {
		// Create the random number generator
		ArrayList<Integer> retValues = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		// Pass in the range of numbers you want
		// Get back an Arraylist with 5 numbers
		RandomGenerator rg = new RandomGenerator();
		
		retValues = rg.FillPool(59, 5);
		
		Collections.sort(retValues);
		
		System.out.print("White Balls: ");
		
		for(Integer item : retValues){
			sb.append(item.toString() + ",");
		}

		//Strip off the last ","
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
		
		retValues = rg.FillPool(35, 1);
		Collections.sort(retValues);

		for(Integer item : retValues){
			System.out.println("Powerball: " + item.toString());
		}
		
	}
}
