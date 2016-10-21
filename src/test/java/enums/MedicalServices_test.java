package enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import enums.MedicalServices;

public class MedicalServices_test {
	
    @Test
    public void getPrices() {
    	assertEquals("DIAGNOSIS", MedicalServices.DIAGNOSIS.getPrice(), 60f, 0.01);    
    	assertEquals("XRAY", MedicalServices.XRAY.getPrice(), 150f, 0.01);
    	assertEquals("BLOOD_TEST", MedicalServices.BLOOD_TEST.getPrice(), 78f, 0.01);
    	assertEquals("ECG", MedicalServices.ECG.getPrice(), 200.40f, 0.01);
    	assertEquals("VACCINE", MedicalServices.VACCINE.getPrice(), 42.50f, 0.01);
    	
    	assertEquals("1 item", MedicalServices.VACCINE.getPrice(), 42.50f, 0.01);
    	assertEquals("2 items", MedicalServices.VACCINE.getPrice(2), 57.50f, 0.01);
    	assertEquals("3 items", MedicalServices.VACCINE.getPrice(3), 72.50f, 0.01);
    	
    	assertEquals("no discount 1", MedicalServices.BLOOD_TEST.getPrice(true, false), 78f, 0.01);
    	assertEquals("no discount 2", MedicalServices.BLOOD_TEST.getPrice(false, true), 78f, 0.01);
    	assertEquals("discount", MedicalServices.BLOOD_TEST.getPrice(true, true), 66.30, 0.01);
    }
}
