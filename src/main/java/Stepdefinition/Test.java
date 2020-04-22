package Stepdefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	public static WebDriver driver;
	
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws MalformedURLException  {
		
		/*
		 * DesiredCapabilities dr=null; Object browserType = null;
		 * if(browserType.equals("firefox")){ dr=DesiredCapabilities.firefox();
		 * dr.setBrowserName("firefox"); dr.setPlatform(Platform.WINDOWS);
		 * 
		 * }else{ dr=DesiredCapabilities.internetExplorer();
		 * dr.setBrowserName("chrome"); dr.setPlatform(Platform.WINDOWS); }
		 */
		//System.setProperty("webdriver.chrome.driver","C:/Users/Kartik/chromedriver/chromedriver.exe");
		//driver = new ChromeDriver();
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
             
        driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        
        
		//System.setProperty("webdriver.chrome.driver","C:/Users/Kartik/chromedriver/chromedriver.exe");
		//RemoteWebDriver remoteWebdriver =new RemoteWebDriver(new    URL("http://localhost:4444/wd/hub"), dr);
		//driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.get("http://google.com");
        driver.quit();
	}

/*	@When("^user navigates to login page$")
	public void user_navigates_to_login_page()  {
	    
	}*/
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password()  {
		
	    
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed()  {
	    
	}
	
}
