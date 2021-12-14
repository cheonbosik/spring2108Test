package t1214.test8;

public class PoliceMan implements Actor {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void getCasting() {
		System.out.println(name + " 님은 경찰관 역할을 할 수 있습니다.");
	}

}
