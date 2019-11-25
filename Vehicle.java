
public abstract class Vehicle {

	// attributes
	String brand;
	int kilometers;

	// Constructor
	public Vehicle(String brand, int kilometers) {
		super();
		this.brand = brand;
		this.kilometers = kilometers;
	}

	// Getters + Setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	// methods
	public abstract String doStuff();

}
