package co.com.automatizacion.web.screenplay.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyDriver {

    public static org.openqa.selenium.WebDriver chrome() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url=System.getProperty("url");
        //driver.get("https://www.demoblaze.com/index.html");
        driver.get(url);
        return driver;
    }

}
