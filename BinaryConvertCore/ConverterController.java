package BinaryConvertCore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterController implements Controller {
	Scanner keyboard = new Scanner(System.in);
	
	BinaryConverter converter = new BinaryConverter();
	
	public ConverterController() {}
	
	public String convertToBinary(int number) { return converter.convertToBinary(number); }
	
	public int getInput(String message) {
		boolean goodInput = false;
		int input = 0;
		do {
			try {
				System.out.print(message);
				input = keyboard.nextInt();
				// This only runs if a valid integer is inputed
				goodInput = true;
			}
			catch(InputMismatchException ex) {
				keyboard.nextLine(); // Clear keyboard buffer
			}
		}
		while(!goodInput);
		/*
		while(!keyboard.hasNextInt()) {
			System.out.println();
			System.out.print(message);
			keyboard.nextLine();
		}
		*/
		return input;			
	}
}
