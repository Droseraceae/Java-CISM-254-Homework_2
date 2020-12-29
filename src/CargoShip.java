/**
 * Chapter 9 Programming Challenge 10: Ship, CruiseShip, and CargoShip Classes
 * This program demonstrates the Ship, CruiseShip, and CargoShip Classes.
 * 
 * @Author Josh Alcoba
 * 2/18/2016
 */
public class CargoShip extends Ship {
	private int tonnage;
	private String toString = null;

	public CargoShip(String name, String yearBuilt, int tonnage) {
		super(name, yearBuilt);
		this.tonnage = tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	public int getTonnage() {
		return tonnage;
	}
	/*@Override*/
	public String toString() {
		return toString = "Name: " + super.getName() + "\nCargo Capacity: " + tonnage;
	}
}