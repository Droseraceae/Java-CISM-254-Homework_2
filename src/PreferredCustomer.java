/*
 * 
 * @Author Josh Alcoba
 * 
 * Demonstrating inheritance 
 * 
 */

public class PreferredCustomer extends Customer {
	private double purchases;
	private double discountLevel;

	public PreferredCustomer() {
		super();
		purchases = 0;
		discountLevel = 0;
	}

	public PreferredCustomer(String name, String address, String phone, String customerNumber, 
			boolean mailingList, double purchases) {
		super(name, address, phone, customerNumber, mailingList);
		this.purchases = purchases;
	}

	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}

	public double getPurchases() {
		return purchases;
	}

	public void setDiscountLevel(double purchases) {
		if (purchases < 500) {
			discountLevel = 0;
		} else if (purchases >= 500 && purchases < 1000) {
			discountLevel = 0.05;
		} else if (purchases >= 1000 && purchases < 1500) {
			discountLevel = 0.06;
		} else if (purchases >= 1500 && purchases < 2000) {
			discountLevel = 0.07;
		} else if (purchases >= 2000) {
			discountLevel = 0.10;
		}
	}

	public double getDiscountLevel() {
		return discountLevel;
	}
}