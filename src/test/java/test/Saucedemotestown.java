package test;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import page.Saucedemopage;

	public class Saucedemotestown {
		
		WebDriver driver;
		@BeforeTest
		public void SetUp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		}
		
		@Test
		public void test()
		{
			Saucedemopage ob=new Saucedemopage(driver);
			ob.setsaucevalues("locked_out_user1","secret_sauce");
			ob.login();
			driver.navigate().refresh();
			
			Saucedemopage ob1=new Saucedemopage(driver);
			ob1.setsaucevalues("problem_user2","secret_sauce");
			ob1.login();
			driver.navigate().refresh();
			
			Saucedemopage ob2=new Saucedemopage(driver);
			ob2.setsaucevalues("performance_glitch_user4","secret_sauce");
			ob2.login();
			driver.navigate().refresh();
			
			Saucedemopage ob3=new Saucedemopage(driver);
			ob3.setsaucevalues("standard_user","secret_sauce");
			ob3.login();
			
			
			
			
		}
			
		
		
			
		}
		



