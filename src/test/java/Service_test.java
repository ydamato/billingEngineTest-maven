import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import enums.MedicalServices;

public class Service_test {
	
	private Service s1;
	private Service s2;
	
    @Before
    public void initObjects() {
    	s1 = new Service(MedicalServices.BLOOD_TEST);
    	s2 = new Service(MedicalServices.VACCINE, 5);
    }
    
	@Test
	public void getMedicalService() {
    	assertEquals("Service 1", s1.getMedicalService(), MedicalServices.BLOOD_TEST);    
    	assertEquals("Service 2", s2.getMedicalService(), MedicalServices.VACCINE);
	}

	
	@Test
	public void getQuantity() {
    	assertEquals("Service 1", s1.getQuantity(), 1);    
    	assertEquals("Service 2", s2.getQuantity(), 5);
	}
}
