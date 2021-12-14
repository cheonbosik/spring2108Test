package t1214.test6;

public class SungjukVO {
	private String name;
	private int kor;
	private int eng;
	private SungjukService sungjukService;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public SungjukService getSungjukService() {
		return sungjukService;
	}
	public void setSungjukService(SungjukService sungjukService) {
		this.sungjukService = sungjukService;
	}
	
	public void getSungjukCalculator() {
		sungjukService.getSungjukCalculator(name, kor, eng);
	}
}
