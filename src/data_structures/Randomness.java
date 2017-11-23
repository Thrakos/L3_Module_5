package data_structures;

import java.util.Random;

public class Randomness {
	
	static boolean randomBoolean() {
		
		int thing;
		
		Random rand = new Random();
		thing = rand.nextInt(2);
		if ( thing == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	static int viciousness() {
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}
}
