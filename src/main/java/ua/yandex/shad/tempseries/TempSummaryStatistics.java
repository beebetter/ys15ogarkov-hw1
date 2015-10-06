package ua.yandex.shad.tempseries;
public class TempSummaryStatistics {
protected double avgTemp;
protected double devTemp;
protected double minTemp;
protected double maxTemp;
public void set(double avgT, double devT, double minT, double maxT) {
	avgTemp = avgT;
	devTemp = devT;
	minTemp = minT;
	maxTemp = maxT;
}
public boolean compare(
double avgT, double devT, double minT, double maxT) {
	if (avgTemp == avgT && devTemp == devT
	&& minTemp == minT && maxTemp == maxT) {
		return true;	
	}
	return false;
}
}
