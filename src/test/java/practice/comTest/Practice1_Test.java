package practice.comTest;

import org.testng.annotations.Test;

public class Practice1_Test {

	@Test(groups="smoke")
	public void test1()
	{
		System.out.println("Test Case 3 has been executed");
	}
	@Test
	public void test2()
	{
		System.out.println("Test Case 4 has been executed");
	}
	@Test(groups= {"smoke","regression"})
	public void test3()
	{
		System.out.println("Test Case 5 has been executed");
	}
	
		
	
}
