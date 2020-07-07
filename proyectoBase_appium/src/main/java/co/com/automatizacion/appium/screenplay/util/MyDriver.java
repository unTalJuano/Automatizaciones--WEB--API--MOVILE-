package co.com.automatizacion.appium.screenplay.util;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class MyDriver {
	

    public static AppiumDriver<MobileElement> appium() throws Exception {
    	
    	DesiredCapabilities capabilities= new DesiredCapabilities();
    	
    	capabilities.setCapability("deviceName", "Android SDK built for x86_64");
    	capabilities.setCapability("platformName", "Android");
    	capabilities.setCapability("platformVersion","9.0");
    	capabilities.setCapability("avdLaunchTimeout", 10000);
    	capabilities.setCapability("avdReadyTimeout", 10000);
    	
    	URL url= new URL("http://127.0.0.1:4723/wd/hub");
        
    	AppiumDriver<MobileElement> driver= new AppiumDriver<>(url,capabilities);
        return driver;
    }

}
