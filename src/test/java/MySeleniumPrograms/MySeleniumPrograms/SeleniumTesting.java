package MySeleniumPrograms.MySeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {
	
	public static void main(String []args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\004PM5744\\Desktop\\Selinium\\chromeDriverlatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
WebDriver chromeDriver = new ChromeDriver();
chromeDriver.get("https://www.google.com/");
chromeDriver.get("https://www.instagram.com/");

}
}
