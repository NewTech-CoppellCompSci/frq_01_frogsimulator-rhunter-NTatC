package frogSimulation;

public class FrogSimulation {

	private int goalDistance;	//distance, in inches, from the starting position to the goal
	private int maxHops;		//maximum number of hops allowed to reach the goal
	
	
	
	//Precondition: dist > 0; numHops > 0
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}
	
	
	//Returns an int representing the distance, in inches, to be moved when the frog hops
	public int hopDistance()
	{	
		return 0;
	}
	
	
	/*
	 * Simulates a frog attempting to reach the foal as described in part (a)
	 * Returns true if the frog successfully reached or passed the goal during the simulation
	 *         false otherwise
	 */
	public boolean simulate() {
		
		/* to be implemented in part (a) */
		
		int totalDistance = 0;
		for (int i = 0; i < maxHops; i++) {
			
			int dist = hopDistance();
			
			totalDistance += dist;
			
			if(totalDistance >= goalDistance) {
				return true;
			}
			else if (totalDistance < 0) {
				return false;
			}
		}
		
		return false;
	}
	
	
	/*
	 * Runs num simulations and returns the proportion of simulations in which the frog
	 * successfully reached or passed the goal.
	 * Precondition: num > 0
	 */
	public double runSimulations(int num) {
		
		/* to be implemented in part (b) */
		int numWins = 0, numLosses = 0;
		
		for (int i = 0; i < num; i++) {
			if (simulate()) {
				numWins++;
			}
			else {
				numLosses++;
			}
		}
		
		return (double) numWins / (numWins + numLosses);
	}
	
	
}
