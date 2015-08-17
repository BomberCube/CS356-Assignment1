/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

import java.util.LinkedList;

/**
 * @author Lance Lentz
 *
 */
public class Question {
	
	protected String[] answertext;
	protected String query;
	protected int[] answers;
	private int count;
	private LinkedList<String> uniqueStudents;
	
	
	/**
	 * @param count: number of questions for the question
	 */
	public Question(int count_) {
		//queries = new String[count];
		answers = new int[count_];
		count = count_;
	}
	
	
	public void increment(int index, Student s) {
		if (!uniqueStudents.contains(s.getID())) {
			increment(index);
			uniqueStudents.add(s.getID());
		}
	}
	
	private void increment(int index) {
		answers[index]++;
	}
	
	public void setMainQuery(String text) {
		query = text;
	}
	
	public void setAnswer(int index, String text) {
		if (index < count) {
			answertext[index] = text;			
		}
	}
	
	public void setAllAnswers(String[] text) {
		for (int i = 0; i < count; i++) {
			answertext[i] = text[i];
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (query != null)
			sb.append(query + "\n");
		for (int i = 0; i < count; i++)
		{
			if (answertext[i] != null)
				sb.append(answertext[i] + "\n");
			
			sb.append((char) (65+i));
			sb.append(" : ");
			sb.append(answers[i]);
			sb.append("\n");
		}
		
		return sb.toString(); 
	}
	
	public void clear() {
		answertext = new String[count];
		
	}
	

}
