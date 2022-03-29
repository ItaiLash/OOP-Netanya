package T1.materials_grp1;
import java.awt.Point;

public class Square extends Shape {
	
	Point p1, p2;
	
	public Square(double[] el, Point a1, Point a2) {
		super(el);
		this.p1 = new Point(a1);
		this.p2 = new Point(a2);
	}
	
	@Override
	public double area() {
		return Math.pow(p1.distance(p2), 2);
	}

}
