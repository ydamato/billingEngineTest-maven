package enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Discounts_test {

    @Test
    public void getDiscountMultiplicator() {    	
    	assertEquals("BLOOD_TEST", Discounts.BLOOD_TEST.getDiscountMultiplicator(), 0.85f, 0.01);    
    	assertEquals("XRAY", Discounts.UNDER_5.getDiscountMultiplicator(), 0.6f, 0.01);
    	assertEquals("BLOOD_TEST", Discounts.OVER_70.getDiscountMultiplicator(), 0.1f, 0.01);
    	assertEquals("ECG", Discounts.BETWEEN_65_AND_70.getDiscountMultiplicator(), 0.4f, 0.01);
    }
}
