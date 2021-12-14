package t1214.test2;

import java.util.Scanner;

import t1214.test1.Calculator;

public class CalculatorRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CalculatorVO vo = new CalculatorVO();
		
		System.out.print("첫 번째수 : ");
		vo.setSu1(sc.nextInt());
		
		System.out.print("두 번째수 : ");
		vo.setSu2(sc.nextInt());
		
		CalculatorService calc = new CalculatorService();
		
		calc.add(vo.getSu1(), vo.getSu2());
		calc.sub(vo.getSu1(), vo.getSu2());
		calc.mul(vo.getSu1(), vo.getSu2());
		calc.div(vo.getSu1(), vo.getSu2());
		
		sc.close();
	}
}
