package practice.q04;

public class Sparrow extends Animal {
	private boolean canFly;
	
	public Sparrow(String name,int age,boolean canFly) {
		super(name,age);
		this.canFly= canFly;
	}
	public boolean isCanFly() {
		return this.canFly;
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	@Override
	public void showInfo() {
		System.out.println("名前: "+getName());
		System.out.println("年齢 "+getAge());
		if(this.canFly) {
			System.out.println("飛べます");
		}
		else {
			System.out.println("飛べない");
		}
	}
	
	public void cry() {
		System.out.println("鳴き声: チュンチュン");
	}
}
