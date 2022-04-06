package T3.Practice2;

public class Circus {
	private CircusEmployee[] _employees;
	private int _index;

	public Circus() {
		_employees = new CircusEmployee[30];
		_index = 0;
	}

	public boolean addEmployee(CircusEmployee ce) {
		if (_index < _employees.length) {
			_employees[_index++] = ce;
			return true;
		}
		return false;
	}

	public int calculateTotalSalary() {
		int sum = 0;
		for (int i = 0; i < _index; i++) {
			sum += _employees[i].calculateSalary();
		}
		return sum;
	}

	public int noOfEmployeesForNextShow() {
		int counter = 0;
		for (int i = 0; i < _index; i++) {
			if (_employees[i].continueToNextShow()) {
				counter++;
			}
		}
		return counter;
	}

	public float clownsSalaryPercent() {
		int sum = 0;
		for (int i = 0; i < _index; i++) {
			if (_employees[i] instanceof Clown) {
				sum = sum + _employees[i].calculateSalary();
			}
		}
		return (float) sum / (float) calculateTotalSalary() * 100;
	}
}
