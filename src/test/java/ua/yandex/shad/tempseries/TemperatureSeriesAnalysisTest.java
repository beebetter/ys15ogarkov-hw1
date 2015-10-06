package ua.yandex.shad.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysisTest {
    
    @Test
    public void testAverage() {
        double[] temperatureSeries = {1.0, -5.0, -1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;
        double actualResult = seriesAnalysis.average();        
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testAverageFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.average();   
    }
	
	@Test
    public void testAverageTest2() {
        double[] temperatureSeries = {1.0, 2.0, 3.0, 4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 2.5;
        double actualResult = seriesAnalysis.average();        
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testDeviationFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.deviation();   
    }
	
	@Test
    public void testDeviation() {
        double[] temperatureSeries = {0.0, 0.0, 14.0, 14.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 7.0;
        double actualResult = seriesAnalysis.deviation();
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test
    public void testDeviationTest2() {
        double[] temperatureSeries = {6.0, 8.0, 6.0, 8.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;
        double actualResult = seriesAnalysis.deviation();
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test
    public void testDeviationTest3() {
        double[] temperatureSeries = {1.0, 2.0, 3.0, 4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.1180339887499;
        double actualResult = seriesAnalysis.deviation();
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testMinFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.min();   
    }
	
	@Test
    public void testMin() {
        double[] temperatureSeries = {6.0, 8.0, 6.0, 8.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 6.0;
        double actualResult = seriesAnalysis.min();
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testMaxFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.max();   
    }
	
	@Test
    public void testMax() {
        double[] temperatureSeries = {6.0, 8.0, 6.0, 8.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 8.0;
        double actualResult = seriesAnalysis.max();
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.findTempClosestToZero();   
    }
	
	@Test
    public void testFindTempClosestToZero() {
        double[] temperatureSeries = {3.0, -2.0, 3.0, 2.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 2.0;
        double actualResult = seriesAnalysis.findTempClosestToZero();        
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToValueFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.findTempClosestToValue(10);   
    }
	
	@Test
    public void testFindTempClosestToValue() {
        double[] temperatureSeries = {5.0, -2.0, 3.0, 2.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -2.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-1.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test
    public void testFindTempClosestToValueTest2() {
        double[] temperatureSeries = {5.0, -2.0, 3.0, 2.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 2.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(0.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test
    public void testFindTempClosestToValueTest3() {
        double[] temperatureSeries = {5.0, -2.0, 3.0, 2.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(100.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testFindTempsLessThenFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.findTempsLessThen(10);   
    }
	
	@Test
    public void testFindTempsLessThen() {
        double[] temperatureSeries = {5.0, -2.0, 3.0, 2.0, -4.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-2.0, -4.0};
        double[] actualResult = seriesAnalysis.findTempsLessThen(1.0);        
        assertArrayEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testFindTempsGreaterThenFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.findTempsGreaterThen(10);   
    }
	
	@Test
    public void testFindTempsGreaterThen() {
        double[] temperatureSeries = {5.0, -2.0, 3.0, 2.0, -4.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {5.0, 3.0, 2.0};
        double[] actualResult = seriesAnalysis.findTempsGreaterThen(1.0);        
        assertArrayEquals(expResult, actualResult, 0.00001);        
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testSummaryStatisticsFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.summaryStatistics();   
    }
	
	@Test
    public void testSummaryStatistics() {
        double[] temperatureSeries = {6.0, 8.0, 6.0, 8.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        TempSummaryStatistics actualResult = seriesAnalysis.summaryStatistics();
        assertTrue(actualResult.compare(7.0, 1.0, 6.0, 8.0));       
    }
	
	@Test
    public void testSummaryStatisticsExpectedFail() {
        double[] temperatureSeries = {6.0, 8.0, 6.0, 8.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        TempSummaryStatistics actualResult = seriesAnalysis.summaryStatistics();
        assertFalse(actualResult.compare(7.0, 2.0, 6.0, 8.0));       
    }
	
	@Test(expected = InputMismatchException.class)
    public void testTemperatureSeriesAnalysisFailWhenOutOfRange() {
        double[] temperatureSeries = {0.0, -274.0, -272.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);        
    }
    
}
