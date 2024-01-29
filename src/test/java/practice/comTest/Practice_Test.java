package practice.comTest;

import org.testng.annotations.Test;

public class Practice_Test {
	
	@Test(groups="smoke")
	public void TestCase1()
	{
		System.out.println("Test Case 1 has been executed");
	}
	
	@Test
	public void Testcase2()
	{
		System.out.println("Test Case 2 has been executed");
		System.out.println("Test Case 12 has been executed");
		System.out.println("Test Case 21 has been executed");
	}

}
