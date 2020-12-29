/**
 * Chapter 9 Programming Challenge 10: Ship, CruiseShip, and CargoShip Classes
 * This program demonstrates the Ship, CruiseShip, and CargoShip Classes.
 * 
 * @Author Josh Alcoba
 * 2/18/2016
 */
public class CruiseShip extends Ship {
	private int passengers;
	private String toString = null;

	public CruiseShip(String name, String yearBuilt, int passengers) {
		super(name, yearBuilt);
		this.passengers = passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}
	
	/*@Override*/
	public String toString() {
		return toString = "Name: " + super.getName() + "\nMaximum Passengers: " + passengers;
	}

}
