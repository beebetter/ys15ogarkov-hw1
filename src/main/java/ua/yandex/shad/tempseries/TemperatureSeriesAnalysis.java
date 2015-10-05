package ua.yandex.shad.tempseries;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import java.util.InputMismatchException;
public class TemperatureSeriesAnalysis {    

	public static final int MIN_TEMPERATURE = -273;
	private double[] temperatureSeries;
	private int curLength;
	
    public TemperatureSeriesAnalysis() {
        
    }
    
    public TemperatureSeriesAnalysis(double[] tempSeries) {
        boolean withinTheRange = true;
		for (double t : tempSeries) {
			if (t < MIN_TEMPERATURE) {
				withinTheRange = false;
			}
		}
		if (withinTheRange) {
			temperatureSeries = (double[])tempSeries.clone();
			curLength = temperatureSeries.length;
		}
				//else throw new InputMismatchException();
    }
    
    public double average() {   
		if (temperatureSeries.length == 0) {
			throw new IllegalArgumentException();
		}
		double sum = 0;
		for (int i = 0; i < curLength; i++) {
			sum += temperatureSeries[i];
		}
        return sum / curLength;
    }    
    
    public double deviation() {
		if (temperatureSeries.length == 0) {
			throw new IllegalArgumentException();
		}
		double res = 0, avg = average();
		for (int i = 0; i < curLength; i++) {
			res += pow(temperatureSeries[i] - avg, 2);
		}
		res *= 1.0 / ((double) curLength);
		res = sqrt(res);
        return res;
    }
    
    public double min() {
		if (temperatureSeries.length == 0) {
			throw new IllegalArgumentException();
		}
		double curMin = temperatureSeries[0];
		for (int i = 1; i < curLength; i++) {
			if (curMin > temperatureSeries[i]) {
				curMin = temperatureSeries[i];
			}
		}
        return curMin;
    }
     
    public double max() {
		if (temperatureSeries.length == 0) {
			throw new IllegalArgumentException();
		}
		double curMax = temperatureSeries[0];
		for (int i = 1; i < curLength; i++) {
			if (curMax < temperatureSeries[i]) {
				curMax = temperatureSeries[i];
			}
		}
        return curMax;
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
