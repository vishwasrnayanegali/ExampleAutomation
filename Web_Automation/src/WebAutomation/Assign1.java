package WebAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assignment1
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
	static void userbox()
	{
		try
		{
			s.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			s.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("mahesh");
			s.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("sn");
			s.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
			s.findElement(By.id("userDataLightBox_usernameField")).sendKeys("was");
			s.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
			s.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
			s.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modify()
	{
		try
		{
		s.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(3000);
		s.findElement(By.id("userDataLightBox_lastNameField")).clear();
		s.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("sol");
		s.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	static void delete()
	{
		try
		{
			s.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert a=s.switchTo().alert();
			String w=a.getText();
			System.out.println(w);
			a.accept();
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
			s.findElement(By.id("//*[@id='logoutLink']")).click();
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

public class Assign1 {

	public static void main(String[] args) {
		Assignment1.lanuch();
		Assignment1.navigate();
		Assignment1.appLogin();
		Assignment1.minimizepopup();
		Assignment1. userbox();
		Assignment1. modify();
		Assignment1.delete();
		Assignment1.logout();
		Assignment1.close();
		

	}

}
