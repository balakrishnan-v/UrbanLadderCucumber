package com.mindtree.Reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getdriver {
	public static Properties prop;
	public static WebDriver driver;
	public static  WebDriver getdrivertype() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("files\\config.properties");
		prop.load(fis);
		WebDriver driver=null;
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "files\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "files\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "files\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		return driver;
	}
}
