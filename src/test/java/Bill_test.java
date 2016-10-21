import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import interfaces.IBill;

import org.junit.Before;
import org.junit.Test;

import enums.MedicalServices;


public class Bill_test {

	private Patient under5Patient;
	private Patient regularPatient;
	private Patient between65and70Patient;
	private Patient over70Patient;
	
	private Service diagnosisService;
	private Service xrayService;
	private Service bloodTestService;
	private Service ecgService;
	private Service vaccineService;
	
    @Before
    public void initObjects() {
    	under5Patient = new Patient(4, false);
    	regularPatient = new Patient(30, true);
    	between65and70Patient = new Patient(66, false);
    	over70Patient = new Patient(80, true);
    	
    	diagnosisService = new Service(MedicalServices.DIAGNOSIS);
    	xrayService = new Service(MedicalServices.XRAY);
    	bloodTestService = new Service(MedicalServices.BLOOD_TEST);
    	ecgService = new Service(MedicalServices.ECG);
    	vaccineService = new Service(MedicalServices.VACCINE, 3);
    	
    }
    
    private IBill generateBill(Patient patient, boolean hasBeenDoneByMediHealthPractitioner,
    			Service... services) {
    	ArrayList <Service> servicesAsList = new ArrayList<Service>(Arrays.asList(services));
					return new Bill(patient, servicesAsList, hasBeenDoneByMediHealthPractitioner);	
    }
    
	@Test
	public void getBillPrice() {
    	assertEquals("Bill 1", generateBill(under5Patient, false, xrayService, ecgService).getBillPrice(), 210.24f, 0.01);    
    	assertEquals("Bill 2", generateBill(regularPatient, false, vaccineService).getBillPrice(), 72.5f, 0.01); 
    	assertEquals("Bill 3", generateBill(between65and70Patient, true, bloodTestService, diagnosisService).getBillPrice(), 55.2f, 0.01); 
    	assertEquals("Bill 4", generateBill(over70Patient, true, bloodTestService, vaccineService).getBillPrice(), 13.88f, 0.01); 
	}
}
