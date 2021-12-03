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
	public class login {
		WebDriver driver;
		
		 @Given("^User should land on the url$")
		    public void user_should_land_on_the_url() throws Throwable {
			 System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
				
				driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				driver.get("http://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				
		    }
		
		    @When("^User should enter the correct user id and password$")
		    public void user_should_enter_the_correct_user_id_and_password() throws Throwable {
		    	
		    	driver.findElement(By.xpath("//input[@name=\"userName\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("nikita");
				driver.findElement(By.xpath("//input[@name=\"password\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("qwerty");
				
		    }

		    @Then("^User click on Submit button and successfully register the application$")
		    public void user_click_on_submit_button_and_successfully_login_into_the_application() throws Throwable {
		    
				driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

		    }

		}
		
	





