package T1.materials_grp2;


public class B extends A{

	int b;
	
	public B() {
		super();
		this.b = 0;
	}

	public B(int aa, int bb) {
		super(aa);
		this.b = bb;
	}
	
	@Override
	public int func1() {
		return b;
	}
	
	@Override
	public void func2() {
		super.func2();
		System.out.println("b = " + this.b);

	}


	
	
	
	
}
