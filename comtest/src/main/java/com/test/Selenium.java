package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
	    ChromeOptions options = new ChromeOptions();
	    
        System.setProperty("webdriver.chrome.driver","comtest/lib/chromedriver.exe"); // <-- Change this path
	    
	    options.addArguments("--disable-web-security");
options.addArguments("--ignore-urlfetcher-cert-requests");
options.addArguments("--disable-renderer-backgrounding");
options.addArguments("--disable-infobars");
options.addArguments("--start-maximized");
options.addArguments("--no-sandbox");
if (isHeadless) {
    options.addArguments("--headless");
}
	    webDriver = new ChromeDriver(options);
       // WebDriver driver = new ChromeDriver();
        String baseUrl = "https://google.com";
        String expectedTitle = "Google";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
		System.out.println(actualTitle);
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.close();
    }
}
