package T7.materials_grp1;

public class Program {

	public static void main(String[] args) {
		try {
			Rational r1=new Rational(3, 4);
			r1.show();
		}
		catch(MechaneZero m) {
			System.out.println("Mechane can not be 0");
		}
		try {
			Rational r2=new Rational(-1, 2);
			r2.show();
		}
		catch(MechaneZero m) {
			System.out.println("Mechane can not be 0");
		}
		try {
			Rational r3=new Rational(2, 0);
			r3.show();
		}
		catch(MechaneZero m) {
			System.out.println("Mechane can not be 0");
		}
		try {
			Rational r4=new Rational(5, 6);
			r4.show();
		}
		catch(MechaneZero m) {
			System.out.println("Mechane can not be 0");
		}



	}

}
