package Runner;

import Binary.Binary;
import BinaryConvertCore.ConverterController;

public class BinaryRunner {
	
	public static void main(String[] args) {
		Binary binary1 = new Binary();
		int input;
		
		ConverterController controller = new ConverterController();
		
		input = controller.getInput("Enter an integer: ");
		binary1.setBinaryValue(controller.convertToBinary(input));
		
		// Automatically runs custom toString method to output class representation
		System.out.println(binary1);
	}
}
