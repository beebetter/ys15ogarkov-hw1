package ua.yandex.shad.tempseries;
public class TempSummaryStatistics {
	public double avgTemp;
	public double devTemp;
	public double minTemp;
	public double maxTemp;
	
	public void set(double avgT, double devT, double minT, double maxT) {
		avgTemp = avgT;
		devTemp = devT;
		minTemp = minT;
		maxTemp = maxT;
	}
}
