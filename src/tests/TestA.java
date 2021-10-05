package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.*;
import frogSimulation.FrogSimulation;

class TestA {

	private static FS1 fs1;
	
	@BeforeAll
	static void beforeAll() {
		fs1 = new FS1(30, 5);
	}
	
	
	@Test
	@DisplayName("Test Part A #1: Wins with Max Jumps")
	void test1() {
		
		try {
			Assertions.assertTrue(fs1.simulate());
			
			if (fs1.getCount() != 4) {
				System.out.println("Test 1 failed: "
								 + "Should have jumped 5 times");
				Assertions.fail();
			}
			
			System.out.println("Test #1: Passed (Wins with Max Jumps)");
			
		}
		catch (Error e) {
			System.out.println("Test #1 failed to detect winning "
							 + "in the Max nuimber of jumps.\n");
			Assertions.fail();
		}
		
	}

	
	
	@Test
	@DisplayName("Test Part A #2: Barely Wins with Max Jumps")
	void test2() {
		
		
		try {
			Assertions.assertTrue(fs1.simulate());
			if (fs1.getCount() != 9) {
				System.out.println("Test 2 failed: "
								 + "Should have jumped 5 times");
				Assertions.fail();
			}
			
			System.out.println("Test #2: Passed (Barely Wins with Max Jumps)");
			
		}
		catch (Error e) {
			System.out.println("Test #2 failed to detect winning "
							 + "in the Max nuimber of jumps.\n");
			Assertions.fail();
		}
		
	}
	
	
	
	@Test
	@DisplayName("Test Part A #3: Frog gets negative overall distance")
	void test3() {
		
		
		try {
			Assertions.assertFalse(fs1.simulate());
			
			if (fs1.getCount() != 12) {
				System.out.println("Test 3 failed: "
								 + "Should have jumped 3 times");
				Assertions.fail();
			}
			
			System.out.println("Test #3: Passed (Frog gets negative overall distance)");
			
		}
		catch (Error e) {
			System.out.println("Test #3 failed to detect negative overall distance."
							 + "\n");
			Assertions.fail();
		}
		
	}
	
	@Test
	@DisplayName("Test Part A #4: Frog does not reach the goal")
	void test4() {
		
		
		try {
			Assertions.assertFalse(fs1.simulate());
			
			if (fs1.getCount() != 17) {
				System.out.println("Test 4 failed: "
								 + "Should have jumped 5 times");
				Assertions.fail();
			}
			
			System.out.println("Test #4: Passed (Frog does not reach the goal)");
			
		}
		catch (Error e) {
			System.out.println("Test #4 failed to detect frog didn't reach the goal."
							 + "\n");
			Assertions.fail();
		}
		
	}
	
	
	
	public static int getNum() {
		
		return 0;
	}
	
}
