package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinition {
    WebDriver driver;

    @Given("^User is on register page$")
    public void User_is_on_register_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("^Title of register page$")
    public void Title_of_register_page() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register", title);
    }

    @Then("^User enters require details$")
    public void user_enters_details() {
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Krutik");
        driver.findElement(By.id("LastName")).sendKeys("Prajapati");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("24");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1984");
        driver.findElement(By.id("Email")).sendKeys("krusisbak@yahoo.co.uk");
        driver.findElement(By.id("Company")).sendKeys("Yogi Divine Society");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id(("Password"))).sendKeys("Guru@911");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Guru@911");
    }

    @Then("^User click on register button$")
    public void user_click_on_register_button() {
        driver.findElement(By.id("register-button")).click();

    }


    @Then("^Close the browser$")
    public void close_the_browser() {
        driver.close();
    }
}
