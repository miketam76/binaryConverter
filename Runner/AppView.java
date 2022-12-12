package Runner;

import Binary.Binary;
import BinaryConvertCore.Controller;

/* Program which demonstrates the use of MVC (Model/View/Controller) */
public class AppView {
	//TODO: Add menu for selecting other binary conversions other than 8 bit
	public static void main(String[] args) {
		Binary binary = new Binary();
		int input;

		input = Controller.getInput("Enter an integer: ");
		binary.setBinaryValue(Controller.convertToBinary(input));
		
		// Automatically runs custom toString method to output class representation
		System.out.println(binary);
	}
}
