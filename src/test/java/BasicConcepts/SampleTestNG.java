package BasicConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import ins.aiite.BaseClass.BaseClass;

public class SampleTestNG {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@Parameters({"pass","browser","user"})
	@Test(priority=1,groups="crossbrowser")
	public void password(String p,String b,String u)
	{
		System.out.println("Password is : " + p + " and browser is : " + b + " USer Is: " + u);
		WebDriver wb=null;
		if(b.equals("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			wb = new ChromeDriver(options);
		}
		else if(b.equals("edge"))
		{
			wb = new EdgeDriver();
		}
		
		BaseClass.selectingBrowser(b);
		BaseClass.getUrl("www.google.com");
	}
	
	@Parameters({"user","browser"})
	@Test(priority=0)
	public void username(String u,String b)
	{
		System.out.println("User: " + u + " is using browser: " + b);
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("login");
	}	
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
