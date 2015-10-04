package ua.yandex.shad;

public class App 
{
	public static final int MIN_TEMPERATURE = -273;
    public static double avg(double x, double y){
		return (x+y)/2;
	}
	public static int findTempClosestToZero(int ... arr){
		if (arr.length == 0)
			throw new IllegalArgumentException();
		for (int val : arr) {
			if (val < MIN_TEMPERATURE)
				throw new IllegalArgumentException();
		}
		int minPos = arr[0];
		if (arr.length > 1)
			for (int i = 1; i < arr.length; i++)
				if (minPos > arr[i])
						minPos = arr[i];
		return minPos;
	}
}
