/**
 * 
 */
package edu.cpp.cs356.iVoteSimulator;

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
		Question debug = new Question(4, "test 1");
		Question debug2 = new Question(12, "test 2");
		Question debug3 = new BooleanQuestion(0, "test B");
		System.out.println(debug.toString());
		System.out.println(debug2.toString());
		System.out.println(debug3.toString());
	}

}
