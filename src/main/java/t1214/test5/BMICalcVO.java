package t1214.test5;

public class BMICalcVO {
	private double lowWeight; 	// 저체중
	private double normal;			// 정상(보통)
	private double overWeight;	// 과체중
	private double obesity;			// 비만
	
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public void bmiCalculator(String name, double height, double weight) {
		double h = height / 100;
		double result = weight / (h * h);		// 체질량(BMI) 구하는 공식
		
		System.out.println(name + "의 BMI 지수 : " + (int) result);
		
		if(result > obesity) {
			System.out.println("당신은 비만입니다.");
			System.out.println("기름진 음식은 자제하시고, 운동을 많이 하세요");
		}
		else if(result > overWeight) {
			System.out.println("당신은 과체중입니다.");
			System.out.println("탄수화물의 양을 줄이시고, 체식과 적당한 운동을 자주 하세요");
		}
		else if(result > normal) {
			System.out.println("당신은 정상입니다.");
			System.out.println("꾸준히 유지하세요.");
		}
		else {
			System.out.println("당신은 저체중입니다.");
			System.out.println("아무 음식이나 골고루 드시고, 운동을 생활화 하세요");
		}
	}
}
