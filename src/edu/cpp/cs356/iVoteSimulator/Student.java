/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

import java.util.UUID;
import java.util.Random;

/**
 * @author Lance Lentz
 *
 */
public class Student {

	
	private int favorite;
	private UUID ID;
	/**
	 * 
	 */
	public Student() {
		ID = UUID.randomUUID();
		favorite = -1;
	}
	
	public int favoriteAnswer(int range) {
		if ((favorite != -1) && (favorite < range))
			return favorite;
		favorite = new Random().nextInt(range -1);
		return favorite;
	}
	
	
	public String getID() {
		return ID.toString();
	}

}
