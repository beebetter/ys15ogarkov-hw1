package ua.yandex.shad.tempseries;

//import java.util.InputMismatchException;
public class TemperatureSeriesAnalysis {    

	public static final int MIN_TEMPERATURE = -273;
	private double[] temperatureSeries;
	
    public TemperatureSeriesAnalysis() {
        
    }
    
    public TemperatureSeriesAnalysis(double[] tempSeries) {
        boolean withinTheRange = true;
		for (double t : tempSeries) {
			if (t < MIN_TEMPERATURE)
				withinTheRange = false;
		}
		if (withinTheRange) {
			temperatureSeries = (double[])tempSeries.clone();
		}
				//else throw new InputMismatchException();
    }
    
    public double average() {   
		if (temperatureSeries.length == 0)
			throw new IllegalArgumentException();
        return 0;
    }    
    
    public double deviation() {
		if (temperatureSeries.length == 0)
			throw new IllegalArgumentException();
        return 0;
    }
    
    public double min() {
		if (temperatureSeries.length == 0)
			throw new IllegalArgumentException();
        return 0;
    }
     
    public double max() {
		if (temperatureSeries.length == 0)
			throw new IllegalArgumentException();
        return 0;
    }
    
    public double findTempClosestToZero() {
        return 0;
    }
    
    public double findTempClosestToValue(double tempValue) {
        return 0;
}
    
    public double[] findTempsLessThen(double tempValue) {
        return null;
    }
    
    public double[] findTempsGreaterThen(double tempValue) {
        return null;
    }
    
    public TempSummaryStatistics summaryStatistics() {
        return null;
    }
    
    public int addTemps(double ... temps) {
        return 0;
    }
}
