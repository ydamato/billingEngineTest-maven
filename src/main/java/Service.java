import interfaces.IMedicalServices;
import interfaces.IService;

public class Service implements IService {
	private IMedicalServices medicalService;
	private int quantity;
	
	/**
	 * 
	 * @param medicalService
	 * @param quantity
	 */
	public Service(IMedicalServices medicalService, int quantity) {
		this.medicalService = medicalService;
		this.quantity = quantity;
	}
	
	/**
	 * 
	 * @param medicalService
	 */
	public Service(IMedicalServices medicalService) {
		this.medicalService = medicalService;
		this.quantity = 1;
	}

	public IMedicalServices getMedicalService() {
		return this.medicalService;
	}

	public int getQuantity() {
		return quantity;
	}
}
