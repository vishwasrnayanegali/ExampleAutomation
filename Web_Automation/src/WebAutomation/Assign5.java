package WebAutomation;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Assignment5
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
	
	static void newProject()
	{
		try
		{
			s.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			s.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			s.findElement(By.id("projectPopup_projectNameField")).sendKeys("Development");
			Thread.sleep(2000);
			//s.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/div/div/div[1]/div[4]/div[2]/table/tbody/tr/td[2]/em/button")).click();
			//Thread.sleep(4000);
			s.findElement(By.xpath("")).click();
			//s.findElement(By.xpath("/html/body/div[25]/ul/li[3]/a/img")).click();
			//Thread.sleep(4000);
			// List<WebElement> list = s.findElements(By.xpath("//ul[contains(@class,'x-menu-list')]//li//a//img"));
			//Thread.sleep(4000);
			//System.out.println(list.size());
			
			//Select r=new Select(s.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/div/div/div[1]/div[4]/div[2]/table/tbody/tr/td[2]/em/button")));
			//Thread.sleep(2000);
			//r.selectByVisibleText("sad");
			/*s.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Development of app");
			Thread.sleep(2000);
			s.findElement(By.id("createTasksBlockButton")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("//*[@id=\"projectPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("planning");
			Thread.sleep(4000);
			s.findElement(By.xpath("//*[@id=\"ext-gen171\"]/td[2]/em")).click();
			Thread.sleep(4000);
			s.findElement(By.id("ext-gen240")).click();
			Thread.sleep(4000);
			s.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(4000);*/
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void deleteproject()
	{
		try
		{
			s.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			s.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			s.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			s.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletecostumer()
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
public class Assign5 {

	public static void main(String[] args) {
		Assignment5.lanuch();
		Assignment5.navigate();
		Assignment5.appLogin();
		Assignment5.minimizepopup();
		Assignment5.costumer();
		Assignment5.newProject();
		//Assignment5.deleteproject();
		//Assignment5.deletecostumer();
		//Assignment5.logout();
		//Assignment5.close();
		

	}

}
