package ua.yandex.shad;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
	@Test
	public void testAvg(){
		System.out.println("sum");
		double x = 0.0; double y = 0.0; double expResult = 0.0;
		double result = App.avg(x, y);
		assertEquals(expResult, result, 0.0001);
//		fail("The test case is a prototype");
	}
	@Test(expected = IllegalArgumentException.class)
	//значиит, что при выполнении метода должно выпасть исключение
	public void testFindTempClosestToZeroFailOnEmptyList(){
		int [] arr = {};
		App.findTempClosestToZero(arr);
		//fail("Fail first time");
	}
	@Test
	public void testFindTempClosestToZeroWithSingleElement(){
		int [] arr = {1};
		int expResult = 1;
		int result = App.findTempClosestToZero(arr);
		assertEquals(expResult, result);
		//fail("Fail first time");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testFindTempClosestToZeroFailTempOutOfRange(){
		int [] arr = {0, 10, -100, -274};
		App.findTempClosestToZero(arr);
		//fail("Fail first time");
	}
	@Test(timeout = 10)
	public void testFindTempClosestToZeroWithPositiveList(){
		int [] arr = {7, 3, 6, 2, 4};
		int expResult = 2;
		int result = App.findTempClosestToZero(arr);
		assertEquals(expResult, result);
		//fail("Fail first time");
	}
}