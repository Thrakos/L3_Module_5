package data_structures;

import java.util.ArrayList;

public class Plane {
	
	ArrayList<Snake> snakes = new ArrayList<Snake>();
	int passengers;
	
	Plane(int passengers) {
		
		this.passengers = passengers;
		for (int i = 0; i < 100; i++) {
			snakes.add(new Snake(Randomness.viciousness(), Randomness.randomBoolean()));
		}
		
	}
	
	double chanceOfDeath(Plane p) {
		
		int venom = 0;
		int chance = 0;
		
		for (int i = 0; i < p.snakes.size(); i++) {
			if (p.snakes.get(i).getVenomous(p.snakes.get(i))) {
				venom += p.snakes.get(i).getViciousness(p.snakes.get(i));
			}
		}
		
		chance = (venom * 10)/p.passengers;
		if (chance > 100) {
			chance = 100;
		}
		
		return chance;
	}
	
}

//Total venom = sum of viciousness of venomous snakes (if they aren’t venomous, it might not be pretty, but it won’t kill you!). This will give a value between 0 - 1000.
//% chance of death = (total venom *10)/ number of passengers
//Make sure it can’t be higher than 100%
//
