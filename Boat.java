
public class Boat extends Vehicle {

	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	public Boat(String brand) {
		super(brand, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doStuff() {
		return ("I am " + getBrand() + " and I go glug glug!");
	}
}
