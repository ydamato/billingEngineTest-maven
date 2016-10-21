

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Patient_test {
	
	private Patient p1;
	private Patient p2;
	
    @Before
    public void initObjects() {
    	p1 = new Patient(5, false);
    	p2 = new Patient(60, true);
    }
    
    @Test
    public void getAge() {
    	assertEquals("Patient 1", p1.getAge(), 5);    
    	assertEquals("Patient 2", p2.getAge(), 60);
    }
    
    @Test
    public void hasMediHealthInsurance() {
    	assertEquals("Patient 1", p1.hasMediHealthInsurance(), false);    
    	assertEquals("Patient 2", p2.hasMediHealthInsurance(), true);
    }
}
