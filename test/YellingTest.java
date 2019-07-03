/**
 * Joao Rebelo
 * C0706998
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class YellingTest {
	private Yelling personYelling;
	private ArrayList<String> peopleYelling;
	
	@Before
	public void setUp() throws Exception {
		personYelling = new Yelling();
		peopleYelling = new ArrayList<String>();
	}
	
	@After
	public void tearDown() throws Exception {
		// clear peopleYelling
		peopleYelling = new ArrayList<String>();
	}
	
	// R1: One person is yelling
	@Test
	public void TestR1() {
		peopleYelling.add("Peter");
		String output = personYelling.scream(peopleYelling);
		System.out.println("R1: " + output);
		assertEquals("Peter is yelling", output);
	}
	
	// R2: Nobody is yelling
	@Test
	public void TestR2() {
		String output = personYelling.scream(null);
		System.out.println("R2: " + output);
		assertEquals("Nobody is yelling", output);
		
		// or empty
		peopleYelling = new ArrayList<String>();// clear peopleYelling
		peopleYelling.add("");
		String output2 = personYelling.scream(peopleYelling);
		System.out.println("R2 v2: " + output2);
		assertEquals("Nobody is yelling", output2);
	}
		
	// R3: UPPERCASE YELLING!
	@Test
	public void TestR3() {
		peopleYelling.add("PETER");
		String output = personYelling.scream(peopleYelling);
		System.out.println("R3: " + output);
		assertEquals("PETER IS YELLING", output);
	}
	
	// R4: Two (2) people are yelling
	@Test
	public void TestR4() {
		peopleYelling.add("Peter");
		peopleYelling.add("Kadeem");
		String output = personYelling.scream(peopleYelling);
		System.out.println("R4: " + output);
		assertEquals("Peter and Kadeem are yelling", output);
	}
	// R5: More than 2 people are yelling
	@Test
	public void TestR5() {
		peopleYelling.add("Peter");
		peopleYelling.add("Kadeem");
		peopleYelling.add("Albert");
		String output = personYelling.scream(peopleYelling);
		System.out.println("R5: " + output);
		assertEquals("Peter, Kadeem, and Albert are yelling", output);

		//4 people
		peopleYelling = new ArrayList<String>();// clear peopleYelling
		peopleYelling.add("Peter");
		peopleYelling.add("Kadeem");
		peopleYelling.add("Albert");
		peopleYelling.add("Pritesh");
		String output2 = personYelling.scream(peopleYelling);
		System.out.println("R5 v2: " + output2);
		assertEquals("Peter, Kadeem, Albert, and Pritesh are yelling", output2);
		
	}
	
	// R6: Shouting at a lot of people
	@Test
	public void TestR6() {
		//2 people 
		peopleYelling.add("Peter");
		peopleYelling.add("EMAD");
		String output = personYelling.scream(peopleYelling);
		System.out.println("R6: " + output);
		assertEquals("Peter is yelling. SO IS EMAD!", output);
		
		
		//3 people
		peopleYelling = new ArrayList<String>();// clear peopleYelling
		peopleYelling.add("Peter");
		peopleYelling.add("EMAD");
		peopleYelling.add("Albert");
		String output2 = personYelling.scream(peopleYelling);
		System.out.println("R6 v3: " + output2);
		assertEquals("Peter and Albert are yelling. SO IS EMAD!", output2);
		
		//4 people
		peopleYelling = new ArrayList<String>();// clear peopleYelling
		peopleYelling.add("EMAD");
		peopleYelling.add("Peter");
		peopleYelling.add("Albert");
		peopleYelling.add("Kadeem");
		String output3 = personYelling.scream(peopleYelling);
		System.out.println("R6 v3: " + output3);
		assertEquals("Peter, Albert, and Kadeem are yelling. SO IS EMAD!", output3);
		
	}
	

}