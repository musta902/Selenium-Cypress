package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage () {PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li)[1]/a")
    public WebElement AB_Testing;

    @FindBy(xpath = "//h3")
    public WebElement title;

    @FindBy(xpath = "(//li)[8]/a")
    public WebElement digest_Auth;

  

    

}
