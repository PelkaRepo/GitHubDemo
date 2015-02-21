/**
 * This package holds the main method and is where the main thread
 * will begin iteration
 */
package org.pelka.demo.gitdemo.rest.main;

import org.apache.log4j.*;

/**
 * The Start class is created as a static point from which to start project iteration
 * for the sample project
 * 
 * @author Arnold Pelka
 *
 */
public class Start {
	final static Logger logger = Logger.getLogger(Start.class);

	/**
	 * This is the main method, which initializes the main thread instance.
	 * This method will act as an orchestrator for the rest of the program
	 * 
	 * @param args Any number of command line string arguments
	 */
	public static void main(String[] args) {
		helloWorld("HELLO WORLD");

	}

	/**
	 * This method only returns a valid string, demonstrating a working interface
	 */
	public static String helloWorld(String msg) {
		String output = new String();
		
		output = "|-------------" + msg + "!--------------|";
		logger.info(output);
		
		return output;
	}
}
