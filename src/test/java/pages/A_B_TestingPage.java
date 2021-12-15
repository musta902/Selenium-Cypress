package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class A_B_TestingPage {
    public A_B_TestingPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//h3")
    public WebElement title;
    @FindBy(xpath = "//p")
    public WebElement description;
    @FindBy(xpath = "//a[@target]")
    public WebElement ElementalSelenium;
    @FindBy(xpath = "//a[@href='https://github.com/tourdedave/the-internet']")
    public WebElement ForkMeOnGitHub;



    
}
