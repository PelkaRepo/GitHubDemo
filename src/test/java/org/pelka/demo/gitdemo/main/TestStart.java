/**
 * This is a default testing class for the Start class.
 * This will only test on/off status of methods within the
 * Start class.
 * 
 * @author Arnold Pelka
 * 
 */
package org.pelka.demo.gitdemo.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The TestStart class is a mock JUnit test, evaluating and
 * asserting on the Start class, which launches the main
 * thread for this application
 * 
 * @author Arnold Pelka
 *
 */
public class TestStart {

	/**
	 * Establishes pre-conditions for unit tests
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Establishes post-conditions for unit tests
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Tests the functionality of the hellowWorld method form the
	 * Start class to output a message to the system console
	 * 
	 * Test method for {@link org.pelka.demo.gitdemo.rest.main.Start#helloWorld()}.
	 */
	@Test
	public void testHelloWorld() {
		
		assertEquals("|-------------HELLO WORLD!--------------|",org.pelka.demo.gitdemo.rest.main.Start.helloWorld("HELLO WORLD"));
	}

}
