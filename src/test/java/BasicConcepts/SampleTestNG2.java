package BasicConcepts;

import org.testng.Assert;
import org.testng.annotations.*;

public class SampleTestNG2 {
	
	@Test
	public void Test1()
	{
		System.out.println("Test1");
		String s="AIITE";
		Assert.assertEquals("AIITE", s);
		
	}
	
	@Test @Ignore
	public void Test2()
	{
		System.out.println("Test2");
		String s="AIITE";
		Assert.assertEquals("AII", s);
		
	}
	@Test(enabled=false)
	public void Test3()
	{
		String a="Project Class";
		Assert.assertTrue(a.contains("Class"));
	}
	@Test
	public void Test4()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class"));
	}
	@Test
	public void Test5()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class"));
	}
	@Test
	public void Test6()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class"));
	}
	
	@Test
	public void Test7()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class"));
	}
	

}
