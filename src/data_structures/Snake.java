package data_structures;

public class Snake {
	
	int viciousness;
	boolean venomous;
	
	Snake (int viciousness, boolean venomous) {
		this.venomous = venomous;
		this.viciousness = viciousness;
	}
	
	boolean getVenomous(Snake s) {
		return s.venomous;
	}
	
	int getViciousness(Snake s) {
		return s.viciousness;
	}
	
}
