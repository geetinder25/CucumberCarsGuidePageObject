package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	public static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	
	public final static int TIMEOUT=20;
	public final static int PAGE_LOAD_TIMEOUT=30;
	
	private SeleniumDriver() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		waitDriver =new WebDriverWait(driver,TIMEOUT);
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(seleniumDriver==null) {
			seleniumDriver=new SeleniumDriver();
		}
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
		seleniumDriver=null;
	}
	
}
