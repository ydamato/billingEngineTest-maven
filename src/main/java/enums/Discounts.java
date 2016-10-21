package enums;

import interfaces.IDiscounts;

public enum Discounts implements IDiscounts{
	BLOOD_TEST(15),
	UNDER_5(40),
	OVER_70(90),
	BETWEEN_65_AND_70(60);
	
	private int discount;
	
	/**
	 * 
	 * @param discount
	 */
	Discounts(int discount) {
		this.discount = discount;
	}
	
	/**
	 * Calculate the multiplicator to apply to initial price
	 */
	public float getDiscountMultiplicator() {
		return (100 - (float) this.discount) / 100;
	}
}
