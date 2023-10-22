public class CalculatorTest {

	public static void main(String[] args) {
        // INSTANCES
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
        // METHODS
        System.out.println("\n==============CALC1===============");
		calc1.setOperandOne(10.5);
		calc1.setOperation('+');
		calc1.setOperandTwo(5.2);
		calc1.performOperation();
		System.out.println(calc1.getResults());

        System.out.println("\n==============CALC2===============");
		calc2.setOperandOne(5.5);
		calc2.setOperation('+');
		calc2.setOperandTwo(20);
		calc2.performOperation();
		System.out.println(calc2.getResults());
	}

}

