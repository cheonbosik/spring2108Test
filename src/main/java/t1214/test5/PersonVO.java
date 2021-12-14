package t1214.test5;

public class PersonVO {
	private String name;
	private double height;
	private double weight;
	private BMICalcVO bmiCalcVO;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public BMICalcVO getBmiCalcVO() {
		return bmiCalcVO;
	}
	public void setBmiCalcVO(BMICalcVO bmiCalcVO) {
		this.bmiCalcVO = bmiCalcVO;
	}
	
	public void getResultPrint() {
		System.out.println("성명 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		
		bmiCalcVO.bmiCalculator(name, height, weight);
	}
}
