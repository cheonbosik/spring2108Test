package t1214.test1;

public class CalculatorRun {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.setSu1(100);
		calc.setSu2(200);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
