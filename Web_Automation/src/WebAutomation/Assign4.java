package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assignment4
{
	public static WebDriver s=null;
	static void lanuch()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web_Automation\\Library\\Drivers\\chromedriver.exe");
		s=new ChromeDriver();
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			s.get("http://localhost:81/login.do");
			
			Thread.sleep(3000);
		}
		
		 catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	static void appLogin()
	{
		try
		{
			s.findElement(By.id("username")).sendKeys("admin");
			s.findElement(By.name("pwd")).sendKeys("manager");
			s.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizepopup()
	{
		try
		{
			s.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void costumer()
	{
		try
		{
			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			s.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			s.findElement(By.id("customerLightBox_nameField")).sendKeys("karan");
			Thread.sleep(2000);
			s.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Accenture");
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void modify()
	{
		try {
			s.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			s.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			s.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
			s.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Wipro");
			s.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void delete()
	{
		try
		{
			s.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			s.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			s.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			s.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void close()
	{
		try
		{
			s.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Assign4 {

	public static void main(String[] args) {
		Assignment4.lanuch();
		Assignment4.navigate();
		Assignment4.appLogin();
		Assignment4.minimizepopup();
		Assignment4.costumer();
		Assignment4.modify();
		Assignment4.delete();
		Assignment4.logout();
		Assignment4.close();

	}

}
