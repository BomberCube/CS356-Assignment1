/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

/**
 * @author BomberCube
 *
 */
public class BooleanQuestion extends Question {
	
	int correctAnswer;
	
	/**
	 * @param count_ forced to 2 for boolean questions
	 * @param correctAnswer_ Choose either 0 or 1
	 */
	public BooleanQuestion(int correctAnswer_) {
		super(2);
		if (correctAnswer == 0)
			correctAnswer = 0;
		else
			correctAnswer = 1;
	}
	
	public void increment(int index) {
		if (index == correctAnswer)
			answers[index] += 1;
		else
			answers[index^1] += 1;
		
	}
	
	public String toString() {
		
	}

}
