package T5.Practice2;

public class Container {
	private Valuable[] arr;

	public Container(Valuable[] arr) {
		this.arr = arr;
	}
	
	public double calculateAvarage() {
		double sum = 0;
		
		for(Valuable v : arr) {
			sum = sum + v.getValue();
		}
		
		return sum / arr.length;
	}
	
	public void printContainer() {
		
		for(Valuable v : arr) {
			System.out.println(v.toString());
		}
	}
}
