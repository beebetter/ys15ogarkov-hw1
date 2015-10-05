package ua.yandex.shad.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;

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
    public void testAverage2() {
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
    public void testDeviation2() {
        double[] temperatureSeries = {6.0, 8.0, 6.0, 8.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;
        double actualResult = seriesAnalysis.deviation();
        assertEquals(expResult, actualResult, 0.00001);        
    }
	@Test
    public void testDeviation3() {
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
	@Test
    public void testMax() {
        double[] temperatureSeries = {6.0, 8.0, 6.0, 8.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 8.0;
        double actualResult = seriesAnalysis.max();
        assertEquals(expResult, actualResult, 0.00001);        
    }
	@Test(expected = IllegalArgumentException.class)
    public void testMaxFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.max();   
		//fail("Fail first time");
		
    }
	/*@Test(expected = InputMismatchException.class)
	//@Test(expected = IllegalArgumentException.class)
    public void testTemperatureSeriesAnalysisFailWhenOutOfRange() {
        double[] temperatureSeries = {0.0, -274.0, -272.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);        
    }
    */
}
