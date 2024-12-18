package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.Test;
//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MenoraTest {

	static WebDriver driver;

	//@BeforeTest
	public static void initMyTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
	}
	
	
	
	//@Test
	public static void menoraTest() {
		driver.get("https://www.menoramivt.co.il/");
		driver.findElement(By.cssSelector("#heading-section > div.MainBanner__BannerContent-sc-1tkvyz9-1.eFUiNn.aos-init.aos-animate > a > span.MuiButton-label "));
		String text = driver.findElement(By.cssSelector("#heading-section > div.MainBanner__BannerContent-sc-1tkvyz9-1.eFUiNn.aos-init.aos-animate > a > span.MuiButton-label")).getText();
		System.out.println(text);
	//	Assert.assertEquals(");
		
	}



	public static void test() {
		// TODO Auto-generated method stub
		
	}
	}