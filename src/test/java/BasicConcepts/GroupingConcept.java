package BasicConcepts;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GroupingConcept {
	@Test(groups= {"smoke"})
	public void Test1()
	{
		System.out.println("Test1");
		String s="AIITE";
		Assert.assertEquals("AIITE", s);
		
	}
	
	@Test(groups= {"smoke"})
	public void Test2()
	{
		System.out.println("Test2");
		String s="AIITE";
		Assert.assertEquals("AIITE", s);
		
	}
	@Test(groups= {"smoke","sanity","regression"})
	public void Test3()
	{
		String a="Project Class";
		Assert.assertTrue(a.contains("Class"));
	}
	@Test(groups= {"sanity"})
	public void Test4()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class"));
	}
	@Test(groups= {"sanity"})
	public void Test5()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class"));
	}
	@Test(groups= {"regression"})
	public void Test6()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class"));
	}
	
	@Test(groups= {"regression"})
	public void Test7()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class"));
	}
	
	@Test(groups= {"assert"})
	public void hardAssert()
	{
		String a="Project Class";
		Assert.assertFalse(a.contains("class")); //pass
		System.out.println("pass");
		Assert.assertTrue(true); //pass
		System.out.println("pass");
		Assert.assertTrue(a.contains("Proj")); //pass
		System.out.println("pass");
		//Assert.assertEquals(a, "ProjectClass");//fail
		//System.out.println("fail");	
		
	}
	
	@Test(groups= {"assert"})
	public void softAssert()
	{
		SoftAssert sa=new SoftAssert();
		String a="Project Class";
		//sa.assertFalse(a.contains("Class")); //fail
		//System.out.println("fail");
		sa.assertTrue(true); //pass
		System.out.println("pass");
		sa.assertTrue(a.contains("Proj")); //pass
		System.out.println("pass");
		//sa.assertEquals(a, "ProjectClass");//fail
		//System.out.println("fail");	
		sa.assertAll();
		
	}
	
	@Test(groups= {"dependsOn"},priority=1)
	public void username()
	{
		System.out.println("username");
	}
	
	@Test(groups= {"dependsOn"},priority=2)
	public void password()
	{
		System.out.println("password");
	}
	
	@Test(groups= {"dependsOn"},dependsOnMethods = {"username","password"},priority=0)
	public void login()
	{
		System.out.println("login");
	}
	
	
	

}
