import java.util.Random;

public class TestDemo {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return sum of int a and b if both are positive
	 * 		   or throw an exception if one number is 0 or negative number
	 */
	public int addPositive (int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		}
		else {
			throw new IllegalArgumentException("Both paarameters must be positive!");
		}
	} //end addPositive
	
	/**
	 * 
	 * @return the square of a random number generated by getRandomInt() method
	 */
	public int randomNumberSquared() {
		return getRandomInt() * getRandomInt();
	} //end randomNumberSquared
	
	/**
	 * 
	 * @return random number between 0 and 10
	 */
	int getRandomInt() {
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	} //end getRandomInt

} //end TestDemo class
