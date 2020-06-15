package com.propine.test.propine;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class propineTestScenario1 {
	WebDriver driver;
	String result1;
	@Given("^User redirects to url 'https://vast-dawn-(\\d+)\\.herokuapp\\.com/submit'$")
	public void user_redirects_to_url_https_vast_dawn_herokuapp_com_submit(int arg1) throws Throwable {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		options.addPreference("dom.disable_beforeunload", true);
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://vast-dawn-73245.herokuapp.com/");
	}

	@Given("^enter valid date in Date field \"([^\"]*)\"$")
	public void enter_valid_date_in_Date_field(String vdate) {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div/input")).sendKeys("12/12/12");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Given("^extract the result and display it on console$")
	public void extract_the_result_and_display_it_on_console() {
		String result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		System.out.println(result);
	}
	

	@Then("^close the browser$")
	public void close_the_browser(DataTable arg1) {
		driver.quit();
	}

	@Given("^extract the error and display it on console$")
	public void extract_the_error_and_display_it_on_console() {
		result1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		System.out.println(result1);
	}

	@Given("^Verify the error message$")
	public void verify_the_error_message() {
	    String ActualResult=result1;
	    String ExpectedResult="Invalid date";
	    verifyEquals(ActualResult, ExpectedResult);
	}
	
	private void verifyEquals(String ActualResult, String ExpectedResult) {
		if (ActualResult.equals(ExpectedResult))
			System.out.println("Verified Error message");
		else
			System.out.println("Verification failed");
	
	}	
	@Given("^enter invalid date in Date field \"([^\"]*)\"$")
	public void enter_invalid_date_in_Date_field(String invdate) {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div/input")).sendKeys(invdate);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}



}
