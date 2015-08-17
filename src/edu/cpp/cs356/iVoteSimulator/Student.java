/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

import java.util.UUID;

/**
 * @author Lance Lentz
 *
 */
public class Student {

	
	private UUID ID;
	/**
	 * 
	 */
	public Student() {
		ID = UUID.randomUUID();
	}
	
	public String getID() {
		return ID.toString();
	}

}
