package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Setup {
	
	public static WebDriver d;
	
	public void init() {
	WebDriverManager.chromedriver().setup();
	d=new ChromeDriver();
    d.manage().window().maximize();
	}
}
