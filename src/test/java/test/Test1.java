package test;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import page.Saucedemopage;

	public class Test1 {
		
		WebDriver driver;
		@BeforeTest
		public void SetUp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		}
		
		@Test
		public void test() throws Exception
		{
			Saucedemopage ob=new Saucedemopage(driver);
			FileInputStream ob1=new FileInputStream("/Users/rahul/Desktop/excelforselenium.xlsx");

					XSSFWorkbook wb=new XSSFWorkbook(ob1);
					XSSFSheet sh=wb.getSheet("Sheet2");
					int row=sh.getLastRowNum();
					for(int i=1;i<=row;i++)
					{
					String username=sh.getRow(i).getCell(0).getStringCellValue();

					String password=sh.getRow(i).getCell(1).getStringCellValue();
					ob.setsaucevalues(username, password);
					ob.login();
					Thread.sleep(3000);
					driver.navigate().refresh();
					}
					
					String actual=driver.getCurrentUrl();
					String exp="https://www.saucedemo.com/inventory.html";
					if(actual.equals(exp))
					{
					System.out.println("Login Successfull");

					//ob.cart();
					//ob.checkout();
					//ob.end();
					}
					else
					{
					System.out.println("failed");
					}
			
			
			
		}
			
		
		
			
		}