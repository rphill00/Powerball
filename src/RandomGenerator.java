import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator {
	public ArrayList<Integer> FillPool(int numOfEntries, int numToReturn){
		// Take in the number of entries and fill the ArrayList
		// 59 entries for the white balls
		// 35 entries for the Powerball
		Random generator = new Random();
		Integer poolSize;
		int randNum;
		int ballNum;
		
		ArrayList<Integer> alPool = new ArrayList<Integer>();
		ArrayList<Integer> alReturn = new ArrayList<Integer>();
		
		for (int i = 1; i <= numOfEntries; i++){
			alPool.add(i);
		}

		// Loop through the pool x-times and grab a random number element
		// If removed, remove number from pool and regenerate random number
		for (int i = 1; i <= numToReturn; i++){
			// Generate a random number from 1 to poolSize
			poolSize = alPool.size();

			randNum = generator.nextInt(poolSize);
			ballNum = alPool.get(randNum);
			
			alReturn.add(ballNum);
			alPool.remove(randNum);
		}
		
		return alReturn;
	}
}
