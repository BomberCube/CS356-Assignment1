/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

import java.util.UUID;

/**
 * @author BomberCube
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
	
	public String getUUIDString() {
		return ID.toString();
	}

}
