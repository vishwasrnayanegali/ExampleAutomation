package WebAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class FramesTest1
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web_Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void framesTesting()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame(1);
			oBrowser.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement oFrame=oBrowser.findElement(By.name("classFrame"));
			oBrowser.switchTo().frame(oFrame);
			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class FramesDemo2 {
	public static void main(String[] args) {
		FramesTest1.launchBrowser();
		FramesTest1.navigate();
		FramesTest1.framesTesting();
	}

}
