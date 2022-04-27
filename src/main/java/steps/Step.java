package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.Register;

public class Step {
    WebDriver driver;
    HomePage home;
    Register reg;
    @Given("user launch the chrome browser")
    public void user_launch_the_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }
    @When("user opens url {string}")
    public void user_opens_url(String url) {
        driver.get(url);

    }
    @When("the user click to register button")
    public void the_user_click_to_register_button() {
    home=new HomePage(driver);
    home.clicktoregister();
    }
    @When("the user Check the gender and enter the Firstname as {string} and Lastname as {string} and Email as {string} and Password as\"{int}\" and Confirmapassword as \"{int}\"")
    public void the_user_check_the_gender_and_enter_the_firstname_as_and_lastname_as_and_email_as_and_password_as_and_confirmapassword_as(String firstname, String lastname, String email, Integer password, Integer conpass) {
     reg=new Register(driver);

     reg.setfname(firstname);
        reg.checkgender();
     reg.setlname(lastname);
     reg.setemail(email);
     reg.setpass(String.valueOf(password));
     reg.setconpassword(String.valueOf(conpass));


    }
    @When("click to Register button")
    public void click_to_register_button() {
        reg=new Register(driver);
        reg.registerbtn();
    }
    @When("verify the message of complete register")
    public void verify_the_message_of_complete_register() {
        reg=new Register(driver);
        Assert.assertEquals(reg.text(),"Your registration completed");
    }
    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
