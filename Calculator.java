public class Calculator {
    // MEMBERS VARIABLES
	private double result;
	private double operandOne;
	private double operandTwo ;
	private char operation;
	
    //CONSTRUCTOR
	public Calculator() {
        this.result = 0; 
        this.operandOne = 0;
        this.operandTwo = 0;
	}

    //GETTERS & SETTERS
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
    // OTHERS METHODS
	public void performOperation() {
		if (this.operation == '+') {
			this.result = (this.operandOne + this.operandTwo);
		}
		
		if (this.operation == '-') {
			this.result = (this.operandOne - this.operandTwo);
		}
	}
	
	public double getResults() { 
		return result;
	}	
}
