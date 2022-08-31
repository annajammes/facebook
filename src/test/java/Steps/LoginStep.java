package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;
import utils.Constants;
import utils.FileReader;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;


public class LoginStep extends CommonMethods {

    @Given("User on Facebook website.")
    public void user_on_facebook_website() {
open();
    }
    @When("User enter username in username field.")
    public void user_enter_username_in_username_field() {
sendText(loginPage.userName, FileReader.getPropertyValue("userName"));
    }

    @Given("User  enter Password in password field.")
    public void user_enter_password_in_password_field() {
        sendText(loginPage.password, FileReader.getPropertyValue("password"));
    }
    @When("User click on Login Button.")
    public void user_click_on_login_button() throws InterruptedException {
        click(loginPage.loginButton);
Thread.sleep(3000);
        close();

    }

    @Then("Post a status message Hello World.")
    public void post_a_status_message_hello_world() {
        System.out.println("Hello World");

    }

}
