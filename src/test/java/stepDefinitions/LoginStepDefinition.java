package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginStepDefinition {
    WebDriver driver;

    @Given("^User is on login page$")
    public void User_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("^Title of login page$")
    public void Title_of_login_page() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Login", title);
    }

    // Simple Hard coded scenario
    @Then("^User enters username and password$")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("Email")).sendKeys("krusisbak@yahoo.co.uk");
        driver.findElement(By.id("Password")).sendKeys("Guru@911");
    }

    // Simple data driven  - without example keyword
    @Then("^User Enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Enters_and(String username, String password) {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    // Data driven - with example keyword
    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_username_password(String username, String password) {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @Then("^User Enters Username and Passwords$")
    public void user_Enters_Username_and_Password(DataTable credentials) {
        List<List<String>> data = credentials.raw();
        driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("Password")).sendKeys(data.get(0).get(1));
    }

    @Then("^User click on login button$")
    public void user_click_on_login_button() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).submit();
    }

    @Then("^User is on homepage$")
    public void user_is_on_homepage() {
        String title = driver.getTitle();
        System.out.println("Homepage Title:" + title);
        Assert.assertEquals("nopCommerce demo store", title);
    }

    @Then("^close the browser$")
    public void close_the_browser() {
        driver.quit();
    }

}

