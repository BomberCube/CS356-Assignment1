/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

import java.util.Random;

/**
 * @author Lance Lentz
 *
 */
public class SimulationDriver {

	/**
	 * 
	 */
	public SimulationDriver() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random dice = new Random();
		Question sixQuestion = new Question(6, "Most important reason OOP is useful?");
		Question fourQuestion = new Question(4, "Most secure visibility keyword?");
		Question booleanQuestion = new BooleanQuestion(0, "Our reflection in the mirror is accurate?");
		Student[] students = new Student[15 + dice.nextInt(15)];
		for (int i = 0; i < students.length; i++)
			students[i] = new Student();
		
		
		IVoteService service = new IVoteService();
		service.setNewQuestion(sixQuestion);
		service.studentManyResponse(students, 6);
		service.setNewQuestion(fourQuestion);
		service.studentManyResponse(students, 4);
		service.setNewQuestion(booleanQuestion);
		service.studentManyResponse(students, 2);
		
		System.out.println(sixQuestion.toString());
		System.out.println(fourQuestion.toString());
		System.out.println(booleanQuestion.toString());
	}

}
