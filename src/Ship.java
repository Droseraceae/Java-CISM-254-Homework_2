/**
 * Chapter 9 Programming Challenge 10: Ship, CruiseShip, and CargoShip Classes
 * This program demonstrates the Ship, CruiseShip, and CargoShip Classes.
 * 
 * @Author Josh Alcoba
 * 2/18/2016
 */
public class Ship {
	private String name;
	private String yearBuilt;
	private String toString;

	public Ship(String name, String yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getName() {
		return name;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}
	/*@Override*/
	public String toString() {
		return toString = "Name: " + name + "\nYear built: " + yearBuilt;
	}

}