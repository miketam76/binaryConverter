package Binary;

public class Binary {
	private String binaryValue; // binary value in 8 bytes or 32 bits
		
	// Constructors
	public Binary() { this(""); }
	public Binary(String binaryValue) { this.binaryValue = binaryValue; }
	
	// Getters and setters
	public String getBinaryValue() { return binaryValue; }
	public void setBinaryValue(String binaryValue) { this.binaryValue = binaryValue; }

	public String toString() {
		return "binary value = " + binaryValue;
	}
}
