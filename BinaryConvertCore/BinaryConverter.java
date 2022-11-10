package BinaryConvertCore;

/*
 * Class name: BinaryConverter
 * Description: Contains methods which converts a integer type value to binary (32 bit) stored in a String
 * object
 */

public class BinaryConverter implements BinaryInterface {
	
	
	// Constructors
	public BinaryConverter() { }
	
	// Converts an integer to binary - also shows the calculation breakdown
	public String convertToBinary(int number) {
		int remainder;
		String binaryValue = "";
		
		while(number > 0) {
			System.out.println(number + " / 2 = " + (number / 2) + "\t" + (number % 2));
			remainder = number % 2;
			binaryValue = remainder + binaryValue;
			number = number / 2;
		}
		
		if(binaryValue.length() < 8) {
			int max = 8 - binaryValue.length();
			for(int i = 0; i < max; i++)
				binaryValue = "0" + binaryValue;
		}
		return binaryValue;
	}
	
	@Override
	public void twosComplement(int number) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void convertToSinglePrecision() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void convertToDoublePrecision() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addTwoBinaryNumbers(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void subtractTwoBinaryNumbers(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
}
