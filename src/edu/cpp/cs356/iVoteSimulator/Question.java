/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

/**
 * @author BomberCube
 *
 */
public class Question {
	
	protected String[] queries;
	protected int[] answers;
	private int count;
	
	
	/**
	 * int count: number of questions for the question
	 */
	public Question(int count) {
		queries = new String[count];
		answers = new int[count];
		
	}
	
	public void increment(int index) {
		answers[index]++;
	}
	
	public String toString() {
		for (int i = 0; i < count, i++)
		{
			if (queries[i] != null)
				System.out.printf("%s : %d%n", queries[i], answers[i]);
			else
				System.out.printf("%s : %d%n", (char) (64+count), answers[i]);
		}
		
		return ""; 
		
	}
	

}
