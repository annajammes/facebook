package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.CommonMethods.driver;
public class LoginPage {

   @FindBy(id ="email")
    public WebElement userName;

    @FindBy(id ="pass")
    public WebElement password;

    @FindBy(name ="login")
    public WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
}
