import interfaces.IBill;

import java.util.ArrayList;

import enums.Discounts;

public class Bill implements IBill{

	private Patient patient;
	private ArrayList <Service> services;
	private boolean hasBeenDoneByMediHealthPractitioner;
	
	/**
	 * 
	 * @param patient
	 * @param services
	 */
	public Bill(Patient patient, ArrayList<Service> services) {
		this.patient = patient;
		this.services = services;
		this.hasBeenDoneByMediHealthPractitioner = false;
	}
	
	/**
	 * 
	 * @param patient
	 * @param services
	 * @param hasBeenDoneByMediHealthPractitioner
	 */
	public Bill(Patient patient, ArrayList<Service> services, boolean hasBeenDoneByMediHealthPractitioner) {
		this.patient = patient;
		this.services = services;
		this.hasBeenDoneByMediHealthPractitioner = hasBeenDoneByMediHealthPractitioner;
	}
	
	/**
	 * Calculate the bill price with discounts
	 */
	public double getBillPrice() {
		double price = 0;
		
		for(int i=0; i<services.size(); i++) {
			Service service = services.get(i);
			price += service.getMedicalService().getPrice(service.getQuantity(), 
															patient.hasMediHealthInsurance(), 
															this.hasBeenDoneByMediHealthPractitioner);
		}
		
		if(patient.getAge() >= 65 && patient.getAge() <=70) {
			return price * Discounts.BETWEEN_65_AND_70.getDiscountMultiplicator();
		}
		if(patient.getAge() > 70) {
			return price * Discounts.OVER_70.getDiscountMultiplicator();
		}
		if(patient.getAge() < 5) {
			return price * Discounts.UNDER_5.getDiscountMultiplicator();
		}
		
		return price;
	}	

	
}
