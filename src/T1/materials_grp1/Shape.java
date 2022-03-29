package T1.materials_grp1;

public class Shape {
	
	double [] edgesLen;
	
	public Shape(double[] a) {
		this.edgesLen = a;
	}
	
	public double area() {
		return 0;
	}
	
	public double perimeter() {
		double ans = 0;
		for(int i=0 ; i<edgesLen.length ; i++) {
			ans += edgesLen[i];
		}
		return ans;
	}

}
