package t1214.test4;

public class CalculatorVO {
	private int su1;
	private int su2;
	private CalculatorService calculatorService = new CalculatorService();
	
	public int getSu1() {
		return su1;
	}
	public void setSu1(int su1) {
		this.su1 = su1;
	}
	public int getSu2() {
		return su2;
	}
	public void setSu2(int su2) {
		this.su2 = su2;
	}

	public void add() {
		calculatorService.add(su1, su2);
	}
	public void sub() {
		calculatorService.sub(su1, su2);
	}
	public void mul() {
		calculatorService.mul(su1, su2);
	}
	public void div() {
		calculatorService.div(su1, su2);
	}
}
