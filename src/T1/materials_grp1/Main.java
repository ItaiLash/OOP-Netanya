package T1.materials_grp1;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		double [] triangle = {1.2,1.2,1.2};
		Shape s = new Shape(triangle);
		double per = s.perimeter();
		System.out.println(per);
		
		double [] square = {2,2,2,2};

		
		Square s2 = new Square(square, new Point(1,1), new Point(1,3));
		System.out.println(s2.perimeter());
		System.out.println(s2.area());
	}

}
