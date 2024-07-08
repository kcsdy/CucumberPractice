package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setup() {
		
		System.out.println("@Before - Launching the browser");
	}
	
	
	@After
	public void teardown() {
		
		System.out.println("@after - quit browser");
	}
}
