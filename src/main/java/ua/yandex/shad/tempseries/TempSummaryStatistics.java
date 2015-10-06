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
	public boolean compare(double avgT, double devT, double minT, double maxT) {
		if (avgTemp == avgT && devTemp == devT
		&& minTemp == minT && maxTemp == maxT)
			return true;
		return false;
	}
}
