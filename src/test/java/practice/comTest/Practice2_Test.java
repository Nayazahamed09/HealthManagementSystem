package practice.comTest;

import org.testng.annotations.Test;

public class Practice2_Test {

	
	@Test(groups="smoke")
	public void testMethod()
	{
		System.out.println("Test Case 6 has been executed");
	}
	
	@Test
	public void executeMethod()
	{
		System.out.println("Test Case 7 has been executed");
	}
	
	@Test(groups="regression")
	public void getResult()
	{
		System.out.println("Test Case 8 has been executed");
	}
}
