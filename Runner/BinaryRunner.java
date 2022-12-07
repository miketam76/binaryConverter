package Runner;

import Binary.Binary;
import BinaryConvertCore.ConverterController;

/* Program which demonstrates the use of MVC (Model/View/Controller) */
public class BinaryRunner {
	//TODO: Add menu for selecting other binary conversions other than 8 bit
	public static void main(String[] args) {
		Binary binary = new Binary();
		int input;
		
		
		input = ConverterController.getInput("Enter an integer: ");
		binary.setBinaryValue(ConverterController.convertToBinary(input));
		
		// Automatically runs custom toString method to output class representation
		System.out.println(binary);
	}
}
