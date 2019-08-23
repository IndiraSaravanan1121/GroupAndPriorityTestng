package TestngGroupingTask;

import org.testng.annotations.Test;

public class GroupingTestngTask {
	
	@Test(priority=1)
	public void TestOne()
	{
		System.out.println("TestOne-regression");
	}
	@Test(priority=0,groups= {"sanity","smoke"})
	public void TestTwo()
	{
		System.out.println("TestTwo-Sanity and smoke");
	}
	@Test(priority=3,groups="sanity")
	public void TestThree()
	{
		System.out.println("TestThree-sanity");
	}
	@Test(priority=2,groups= {"regression","smoke"})
	public void TestFour()
	{
		System.out.println("TestFour-regression and smoke");
	}
	
	
	

}
