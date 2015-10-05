package ua.yandex.shad.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureSeriesAnalysisTest {
    
    @Test
    public void testAverage() {
        double[] temperatureSeries = {1.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;
        double actualResult = seriesAnalysis.average();
        
        assertEquals(expResult, actualResult, 0.00001);
        
    }
	/*@Test(expected = InputMismatchException.class)
	//@Test(expected = IllegalArgumentException.class)
    public void testTemperatureSeriesAnalysisFailWhenOutOfRange() {
        double[] temperatureSeries = {0.0, -274.0, -272.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);        
    }
    */
	@Test(expected = IllegalArgumentException.class)
    public void testAverageFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.average();   
		//fail("Fail first time");
		
    }
	@Test(expected = IllegalArgumentException.class)
    public void testDeviationFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.deviation();   
		//fail("Fail first time");
		
    }
	@Test(expected = IllegalArgumentException.class)
    public void testMinFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.min();   
		//fail("Fail first time");
		
    }
	@Test(expected = IllegalArgumentException.class)
    public void testMaxFailOnEmptyList() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
		seriesAnalysis.max();   
		//fail("Fail first time");
		
    }
}
