package stepdefinations;

	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.junit.Cucumber;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.junit.runner.RunWith;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;

	@RunWith(Cucumber.class)
	public class Register {
		WebDriver driver;
		
		 @Given("^User should land on the url$")
		    public void user_should_land_on_the_url() throws Throwable {
			 System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
				
				driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				driver.get("http://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
		    
		 }

		    @When("^User should enter the correct all details$")
		    public void user_should_enter_the_correct_all_details() throws Throwable {
		    	driver.findElement(By.xpath("//input[@name=\"firstName\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("nikita");
				driver.findElement(By.xpath("//input[@name=\"lastName\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Qwerty");
				driver.findElement(By.xpath("//input[@name=\"phone\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("1234567890");
				
				driver.findElement(By.xpath("//input[@id=\"userName\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("nikita@gmail.com");
				driver.findElement(By.xpath("//input[@name=\"address1\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("crossing republic");
				driver.findElement(By.xpath("//input[@name=\"city\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Ghaziabad");
				driver.findElement(By.xpath("//input[@name=\"state\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Uttar Pradesh");
				driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("201016");
				
				Select Country = new Select(driver.findElement(By.name("country")));
				Country.selectByVisibleText("India");
				
				driver.findElement(By.xpath("//input[@id=\"email\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("nikita");
				driver.findElement(By.xpath("//input[@name=\"password\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("qwerty");
				
				driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("qwerty");
		    	
		    
		    }

		    @Then("^User click on Submit button and successfully register the application$")
		    public void user_click_on_submit_button_and_successfully_register_into_the_application() throws Throwable {
		    
				driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

		    }
		    


		}
		
	





