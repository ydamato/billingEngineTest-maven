package interfaces;

public interface IMedicalServices {
	 public float getPrice(int quantity, boolean hasMediHealthInsurance, boolean hasBeenDoneByMediHealthPractitioner);
	 public float getPrice(boolean hasMediHealthInsurance, boolean hasBeenDoneByMediHealthPractitioner);
	 public float getPrice(int quantity);
	 public float getPrice();
	 
}
