package ua.yandex.shad.tempseries;

public class TempSummaryStatistics {
    private double avgTemp;
	private double devTemp;
	private double minTemp;
	private double maxTemp;
	
	public TempSummaryStatistics(double aT, double dT, double sT, double bT) {
		avgTemp = aT;
		devTemp = dT;
		minTemp = sT;
		maxTemp = bT;
	}
}
