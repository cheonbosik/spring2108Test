package t1214.test3;

import java.util.Scanner;

public class CalculatorRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2;
		
		System.out.print("첫 번째수 : ");
		su1 = sc.nextInt();
		
		System.out.print("두 번째수 : ");
		su2 = sc.nextInt();
		
		CalculatorVO vo = new CalculatorVO(su1, su2);
		
		vo.add();
		vo.sub();
		vo.mul();
		vo.div();
		
		sc.close();
	}
}
