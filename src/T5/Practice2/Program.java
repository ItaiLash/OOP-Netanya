package T5.Practice2;

public class Program {

	public static void main(String[] args) {
		Valuable[] arr1 = new Valuable[3];
		arr1[0] = new Student("Avi", "123", 85);
		arr1[1] = new Student("Moshe", "737", 100);
		arr1[2] = new Student("Ori", "934", 60);
		
		Container c1 = new Container(arr1);
		System.out.println(c1.calculateAvarage());
		c1.printContainer();
	}

}
