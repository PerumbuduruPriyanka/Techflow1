package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps {
WebDriver driver;
	
	@Given("Opne Chorme Browser")
	public void opne_chorme_browser() {
		driver = new ChromeDriver();
	    
	}

	@Given("Open URL {string}")
	public void open_url(String string) {
	    driver .get("https://www.demo.guru99.com/v4");
	}

	@When("Login ID Login Password")
	public void login_id_login_password() {
	    driver.findElement(By.name("uid")).sendKeys("mngr511752");
	    driver.findElement(By.name("password")).sendKeys("yrepuvY");
	}

	@When("Click on Submit")
	public void click_on_submit() {
	    driver.findElement(By.name("btnLogin")).click();
	}

	@And("Redirect to Bankpage")
	public void redirect_to_bankpage() {
	WebElement Image= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/center/img[1]"));
	if(Image.isDisplayed())
	{
	System.out.println("Login Success");
	}
	else
	{
	System.out.println("Login Failed");
	}
	}

}
