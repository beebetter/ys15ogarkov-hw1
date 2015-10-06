package ua.yandex.shad.tempseries;
import java.util.InputMismatchException;
public class TemperatureSeriesAnalysis {
    
public static final int MIN_TEMPERATURE = -273;
private double[] tempSeries;
private int curLength;

     TemperatureSeriesAnalysis() {
        tempSeries = new double [0];
        curLength = 0;
    }
    public TemperatureSeriesAnalysis(double[] newTempSeries) {
        for (double t : newTempSeries) {
            if (t < MIN_TEMPERATURE) {
                throw new InputMismatchException();
            }
        }
        tempSeries = (double[]) newTempSeries.clone();
        curLength = tempSeries.length;
    }
        
    public double average() {   
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for (int i = 0; i < curLength; i++) {
            sum += tempSeries[i];
        }
        return sum / curLength;
    }
    
    public double deviation() {
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        double res = 0, avg = average();
        for (int i = 0; i < curLength; i++) {
            res += (tempSeries[i] - avg)*(tempSeries[i] - avg);
        }
        res *= 1.0 / ((double) curLength);
        res = Math.sqrt(res);
        return res;
    }
    
    public double min() {
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        double curMin = tempSeries[0];
        for (int i = 1; i < curLength; i++) {
            if (curMin > tempSeries[i]) {
                curMin = tempSeries[i];
            }
        }
        return curMin;
    }

    public double max() {
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        double curMax = tempSeries[0];
        for (int i = 1; i < curLength; i++) {
            if (curMax < tempSeries[i]) {
                curMax = tempSeries[i];
            }
        }
        return curMax;
    }
    
    public double findTempClosestToZero() {
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        return findTempClosestToValue(0.0);
    }
    
    public double findTempClosestToValue(double tempValue) {
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        double minAbs = Math.abs(tempSeries[0] - tempValue);
        double res = tempSeries[0];
        for (int i = 1; i < curLength; i++) {
            double curAbs = Math.abs(tempSeries[i] - tempValue);
            if (minAbs > curAbs 
            || minAbs == curAbs && tempSeries[i] >= 0) {
                minAbs = curAbs;
                res = tempSeries[i];
            }
        }
        return res;
    }
    
    public double[] findTempsLessThen(double tempValue) {
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        int maxLength = 0;
        for (int i = 0; i < curLength; i++) {
            if (tempSeries[i] < tempValue) {
                maxLength++;
            }
        }
        double[] res = new double [maxLength];
        int curResLength = 0;
        for (int i = 0; i < curLength; i++) {
            if (tempSeries[i] < tempValue) {
                res[curResLength] = tempSeries[i];
                curResLength++;
            }
        }
        return res;
    }
    
    public double[] findTempsGreaterThen(double tempValue) {
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        int maxLength = 0;
        for (int i = 0; i < curLength; i++) {
            if (tempSeries[i] > tempValue) {
                maxLength++;
            }
        }
        double[] res = new double [maxLength];
        int curResLength = 0;
        for (int i = 0; i < curLength; i++) {
            if (tempSeries[i] > tempValue) {
                res[curResLength] = tempSeries[i];
                curResLength++;
            }
        }
        return res;
    }
    
    public TempSummaryStatistics summaryStatistics() {
        if (tempSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        TempSummaryStatistics res = new TempSummaryStatistics();
        res.set(average(), deviation(), min(), max());
        return res;
    }
    
    public int addTemps(double ... temps) {
        while (temps.length + curLength > tempSeries.length) {
            double [] biggerTempSeries = new double[tempSeries.length * 2];
            for (int i = 0; i < curLength; i++) {
                biggerTempSeries[i] = tempSeries[i];
            }
            tempSeries = biggerTempSeries;
        }
        for (int i = 0; i < temps.length; i++) {
            tempSeries[i+curLength] = temps[i];
            }
        curLength += temps.length;
        return curLength;
    }
}
