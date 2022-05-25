package T7.materials_grp1;

public class Rational {

	private int mone,mechane;

	public Rational(int a,int b)throws MechaneZero {
		mone=a;
		if(b==0)
			throw new MechaneZero();
		mechane=b;
	}
	public void show() {
		System.out.println(mone+"/"+mechane);
	}
}
