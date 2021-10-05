package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import frogSimulation.FrogSimulation;

class TestB {

private static FS1 fs1;
private static FS2 fs2;
	
	@BeforeAll
	static void beforeAll() {
		fs1 = new FS1(30, 5);
		fs2 = new FS2(25, 6);
	}
	
	@Test
	@DisplayName("Test Part B #1")
	void test1() {
		
		double winRatio = fs1.runSimulations(400);
		
		try {
			Assertions.assertEquals(winRatio, 0.315);
			
			System.out.println("Test #1: Passed");
			
		}
		catch (Error e ) {
			System.out.println("Test #1 failed to return correct ratio"
								+ "   Expected Output = 0.315");
			Assertions.fail();
		}
		
	}
	
	
	
	
	@Test
	@DisplayName("Test Part B #2")
	void test2() {
		
		double winRatio = fs2.runSimulations(400);
		
		try {
			Assertions.assertEquals(winRatio, 0.595);
			
			System.out.println("Test #2: Passed");
			
		}
		catch (Error e ) {
			System.out.println("Test #2 failed to return correct ratio"
								+ "   Expected Output = 0.595");
			Assertions.fail();
		}
		
	}
	
	

}
