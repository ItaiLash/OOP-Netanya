package T1.materials_grp1;

public class B extends A {
	int b;
	
	public B() {
		super();
		this.b=0;
	}

	public B(int c) {
		super();
		this.b=c;
	}
	
	@Override
	public int func1() {
		return b;
	}
	
	public void func2() {
		super.func2();
		System.out.println(b);
	}
}
