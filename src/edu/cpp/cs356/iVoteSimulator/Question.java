/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

import java.util.LinkedList;

/**
 * @author BomberCube
 *
 */
public class Question {
	
	//protected String[] queries;
	protected int[] answers;
	private int count;
	private LinkedList<String> uniqueStudents;
	
	
	/**
	 * int count: number of questions for the question
	 */
	public Question(int count_) {
		//queries = new String[count];
		answers = new int[count_];
		count = count_;
		
	}
	
	
	public void increment(int index, Student s) {
		if (!uniqueStudents.contains(s.getUUIDString())) {
			increment(index);
			uniqueStudents.add(s.getUUIDString());
		}
	}
	
	private void increment(int index) {
		answers[index]++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++)
		{
			//if (queries[i] != null)
			//	System.out.printf("%s : %d%n", queries[i], answers[i]);
			//else
			//	System.out.printf("%s : %d%n", String((char) (64+count)), answers[i]);
			
			
			sb.append((char) (65+i));
			sb.append(" : ");
			sb.append(answers[i]);
			sb.append("\n");
		}
		
		return sb.toString(); 
	}
	
	public void clear() {
		
	}
	

}
