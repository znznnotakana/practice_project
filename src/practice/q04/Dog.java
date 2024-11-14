package practice.q04;

public class Dog extends Animal {
	private String furColor;
	
	public Dog(String name,int age,String furColor) {
		super(name,age);
		this.furColor=furColor;
	}
	public String getFurcolor() {
		return furColor;
	}
	public void setFurcolor(String furcolor) {
		this.furColor=furcolor;
	}
	@Override
	public void showInfo() {
		System.out.println("名前: "+getName());
		System.out.println("年齢 "+getAge());
		System.out.println("毛の色: "+furColor);
	}
	public void cry() {
		System.out.println("鳴き声: ワン");
	}
}
