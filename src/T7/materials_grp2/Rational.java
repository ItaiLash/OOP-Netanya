package T7.materials_grp2;

public class Rational {

	private int mone,mechane;

	public Rational(int a,int b) {
		mone=a;
		try {
			if(b==0) {
				throw new MechaneZero();
			}
			mechane=b;
		}
		catch(MechaneZero exp) {
			mechane=1;
		}
	}

	public void show() {
		System.out.println(mone+"/"+mechane);
	}
}
