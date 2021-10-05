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
		
		/* implementation not shown */
		
		return 0;
	}
	
	
	/*
	 * Simulates a frog attempting to reach the foal as described in part (a)
	 * Returns true if the frog successfully reached or passed the goal during the simulation
	 *         false otherwise
	 */
	public boolean simulate() {
		
		/* to be implemented in part (a) */
		
		return false;
	}
	
	
	/*
	 * Runs num simulations and returns the proportion of simulations in which the frog
	 * successfully reached or passed the goal.
	 * Precondition: num > 0
	 */
	public double runSimulations(int num) {
		
		/* to be implemented in part (b) */
		
		return 0;
	}
	
	
}
