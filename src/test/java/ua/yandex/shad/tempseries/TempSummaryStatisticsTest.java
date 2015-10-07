package ua.yandex.shad.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;

public class TempSummaryStatisticsTest { 
    @Test
    public void testCompareWhenEqual() {
        TempSummaryStatistics example = new TempSummaryStatistics();
        example.set(1.0, 2.0, 3.0, 4.0);       
        assertTrue(example.compare(1.0, 2.0, 3.0, 4.0));        
    }
    @Test
    public void testCompareFailWhenDifferent() {
        TempSummaryStatistics example = new TempSummaryStatistics();
        example.set(1.0, 2.0, 3.0, 4.0);       
        assertFalse(example.compare(1.0, 3.0, 2.0, 4.0));        
    }
    @Test
    public void testCompareFailWhenDifferent2() {
        TempSummaryStatistics example = new TempSummaryStatistics();
        example.set(1.0, 2.0, 3.0, 4.0);       
        assertFalse(example.compare(1.0, 2.0, 2.0, 4.0));        
    }
    @Test
    public void testCompareFailWhenDifferent3() {
        TempSummaryStatistics example = new TempSummaryStatistics();
        example.set(1.0, 2.0, 3.0, 4.0);       
        assertFalse(example.compare(5.0, 2.0, 2.0, 4.0));        
    }
    @Test
    public void testCompareFailWhenDifferent4_1() {
        TempSummaryStatistics example = new TempSummaryStatistics();
        example.set(1.0, 2.0, 3.0, 4.0);       
        assertFalse(example.compare(5.0, 2.0, 3.0, 4.0));        
    }
    @Test
    public void testCompareFailWhenDifferent4_2() {
        TempSummaryStatistics example = new TempSummaryStatistics();
        example.set(1.0, 2.0, 3.0, 4.0);       
        assertFalse(example.compare(1.0, 5.0, 3.0, 4.0));        
    }
    @Test
    public void testCompareFailWhenDifferent4_3() {
        TempSummaryStatistics example = new TempSummaryStatistics();
        example.set(1.0, 2.0, 3.0, 4.0);       
        assertFalse(example.compare(1.0, 2.0, 5.0, 4.0));        
    }
    @Test
    public void testCompareFailWhenDifferent4_4() {
        TempSummaryStatistics example = new TempSummaryStatistics();
        example.set(1.0, 2.0, 3.0, 4.0);       
        assertFalse(example.compare(1.0, 2.0, 3.0, 5.0));        
    }
}
