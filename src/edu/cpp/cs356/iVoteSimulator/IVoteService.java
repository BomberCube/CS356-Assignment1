/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

/**
 * @author Lance Lentz
 *
 */
public class IVoteService {

	public Question currentQuestion; 
	
	
	/**
	 * 
	 */
	public IVoteService() {
		// TODO Auto-generated constructor stub
	}
	
	public void setNewQuestion(Question q) {
		currentQuestion = q;
	}
	
	public void studentResponse(Student s, int v) {
		currentQuestion.increment(v, s);
	}
	
	public void studentManyResponse(Student[] students, int[] answers, int size) {
		for (int i = 0; i < size; i++) {
			studentResponse(students[i],answers[i]);
		}
	}
	

}
