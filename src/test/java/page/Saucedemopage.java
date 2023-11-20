package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Saucedemopage {
	
	WebDriver driver;
	
	By sauceemail=By.xpath("//*[@id=\"user-name\"]");
	By saucepassword=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("//*[@id=\"login-button\"]");
	
	public Saucedemopage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setsaucevalues(String email,String password)
	{
		driver.findElement(sauceemail).sendKeys(email);
		driver.findElement(saucepassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(login).click();
	}
	public void cart()
	{
		driver.findElement(By.xpath(""));
	}

}
