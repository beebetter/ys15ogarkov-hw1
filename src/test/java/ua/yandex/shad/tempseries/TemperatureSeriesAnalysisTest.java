package ua.yandex.shad.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysisTest {

  @Test(expected = InputMismatchException.class)
    public void testTemperatureSeriesAnalysisFailWhenOutOfRange() {
        double[] temperatureSeries = {0.0, -274.0, -272.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);        
    }
    
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

 @Test
    public void testMin2() {
        double[] temperatureSeries = {50.0, 100.0, 40.0, 80.0, 50.0, 20.0, 10.0, 15.0, 16.0, -17.0, 0.0, -32.0, 11.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -32.0;
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
  @Test
    public void testFindTempClosestToValueTest4_1() {
        double[] temperatureSeries = {-100.0, 120.0, -50.0, 50.0, -10.0, 30.0, 5.0, 15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 15.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(10.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }
  @Test
    public void testFindTempClosestToValueTest4_2() {
        double[] temperatureSeries = {-120.0, 100.0, -70.0, 30.0, -30.0, 10.0, -15.0, -5.0, 5.0, 15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -5.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-10.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest5_1() {
        double[] temperatureSeries = {-120.0, -70.0, -30.0, -15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -15.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-10.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest5_2() {
        double[] temperatureSeries = {-120.0, -70.0, -30.0, -15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -120.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-119.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest5_3() {
        double[] temperatureSeries = {-120.0, -70.0, -30.0, -15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -120.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-121.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }
 
 @Test
    public void testFindTempClosestToValueTest5_4() {
        double[] temperatureSeries = {-120.0, -70.0, -30.0, -15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -15.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-17.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }
 
 @Test
    public void testFindTempClosestToValueTest5_5() {
        double[] temperatureSeries = {-120.0, -70.0, -30.0, -15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -15.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-10.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }
 
  @Test
    public void testFindTempClosestToValueTest6_1() {
        double[] temperatureSeries = {-120.0, -70.0, -30.0, -15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -120.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-120.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest6_2() {
        double[] temperatureSeries = {-120.0, -70.0, -30.0, -15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -15.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-15.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest7_1() {
        double[] temperatureSeries = {10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 10.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(-100.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest7_2() {
        double[] temperatureSeries = {10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 10.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(100.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest7_3() {
        double[] temperatureSeries = {10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 10.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(10.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest8_1() {
        double[] temperatureSeries = {5.0, 15.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 15.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(10.0);        
        assertEquals(expResult, actualResult, 0.00001);        
    }

  @Test
    public void testFindTempClosestToValueTest8_2() {
        double[] temperatureSeries = {-5.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(0.0);        
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

 @Test
    public void testaddTemps() {
        double[] temperatureSeries = {1.0, 2.0, 3.0};
        double[] addTemperatureSeries = {4.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 5;
        int actualResult = seriesAnalysis.addTemps(addTemperatureSeries);
        assertEquals(expResult, actualResult);       
    }
 @Test
    public void testaddTempsNewArrayFarBigger() {
        double[] temperatureSeries = {1.0, 2.0};
        double[] addTemperatureSeries = {3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 9;
        int actualResult = seriesAnalysis.addTemps(addTemperatureSeries);
        assertEquals(expResult, actualResult);       
    }
 
 @Test
    public void testaddTempsAddArrayEmpty() {
        double[] temperatureSeries = {1.0, 2.0};
        double[] addTemperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 2;
        int actualResult = seriesAnalysis.addTemps(addTemperatureSeries);
        assertEquals(expResult, actualResult);       
    }
  @Test
    public void testTemperatureSeriesAnalysisBasicConstructor() {
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();     
        assertNotNull(seriesAnalysis);        
    }
 
}
