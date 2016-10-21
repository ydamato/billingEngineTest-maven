package enums;

import interfaces.IMedicalServices;

public enum MedicalServices implements IMedicalServices{
	
	DIAGNOSIS (60f, 0f),
	XRAY (150f, 0f),
	BLOOD_TEST (78f, 0f),
	ECG (200.40f, 0f),
	VACCINE (27.50f, 15f);
   
  private float servicePrice = 0;
  private float forEachPrice = 0;
   
  /**
   * 
   * @param servicePrice
   * @param forEachPrice
   */
  MedicalServices(float servicePrice, float forEachPrice){
    this.servicePrice = servicePrice;
    this.forEachPrice = forEachPrice;
  }
   
  /**
   * Get price for a service, depending the number of items and specific discounts
   */
  public float getPrice(int quantity, boolean hasMediHealthInsurance, boolean hasBeenDoneByMediHealthPractitioner) {
	  float price = this.servicePrice + this.forEachPrice * quantity;
	  if(this == MedicalServices.BLOOD_TEST && hasMediHealthInsurance && hasBeenDoneByMediHealthPractitioner) {
		  price = price * Discounts.BLOOD_TEST.getDiscountMultiplicator();
	  }
	  return price;
  }
  
  public float getPrice(int quantity) {
	  return getPrice(quantity, false, false);
  }

  public float getPrice() {
	  return getPrice(1, false, false);
  }

  public float getPrice(boolean hasMediHealthInsurance, boolean hasBeenDoneByMediHealthPractitioner) {
	  return getPrice(1, hasMediHealthInsurance, hasBeenDoneByMediHealthPractitioner);
  }
}
