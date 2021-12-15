package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import org.testng.annotations.Test;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class deneme {
    HomePage homePage = new HomePage();

    @BeforeTest
    public void setup() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        ReusableMethods.waitForPageToLoad(10);
       // ReusableMethods.waitFor(5);
        homePage.AB_Testing.click();
    }

    @Test
    public void TC101 () {
        
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.waitFor(5);
          //Verify the title and description
          String currentURL=Driver.getDriver().getCurrentUrl();
          String title=Driver.getDriver().findElement(By.xpath("//h3")).getText();
          String description=Driver.getDriver().findElement(By.xpath("//p")).getText();
  
  
          //List<String> A_B_Page= Arrays.asList(title,description);
  
          //We have two variations of the web pages
          System.out.println(currentURL);
          if (currentURL.equals("http://the-internet.herokuapp.com/abtest")){
              if(title.equals("A/B Test Variation 1")){
                  Assert.assertEquals(title,"A/B Test Variation 1");
              }else {
                  Assert.assertEquals(title,"A/B Test Control");
              }
              System.out.println(title);
  
              Assert.assertEquals(description,"Also known as split testing. " +
                      "This is a way in which businesses are able to simultaneously test " +
                      "and learn different versions of a page to see which text and/or " +
                      "functionality works best towards a desired outcome (e.g. a user " +
                      "action such as a click-through).");
          }else{
              System.out.println("You're on the wrong page");
          }
        // ReusableMethods.waitFor(5);
        // Assert.assertEquals(homePage.title.getText(), "A/B Test Variation 1"); // validation degisebiliyor
    }

    @Test
    public void lambda(){
        //Verify the title and description
        String currentURL=Driver.getDriver().getCurrentUrl();
        String title=Driver.getDriver().findElement(By.xpath("//h3")).getText();
        String description=Driver.getDriver().findElement(By.xpath("//p")).getText();


        List<String> A_B_Page= Arrays.asList("A/B Test Variation 1","A/B Test Control");
        List<String> webElementTexts=Arrays.asList(title,description);


        //We have two variations of the web pages
        if (currentURL.equals("http://the-internet.herokuapp.com/abtest")){
           Assert.assertTrue( A_B_Page.stream().anyMatch(t->t.equals(webElementTexts.get(0))));

            System.out.println(title);

            Assert.assertEquals(description,"Also known as split testing. " +
                    "This is a way in which businesses are able to simultaneously test " +
                    "and learn different versions of a page to see which text and/or " +
                    "functionality works best towards a desired outcome (e.g. a user " +
                    "action such as a click-through).");
        }else{
            System.out.println("You're on the wrong page");
        }
    }
        @Test
        public void TC0102() throws InterruptedException {
            // By comparing the URLs, assert that "Elemental Selenium" AND "Fork me on GitHub" are clickable
            WebElement ElementalSelenium=Driver.getDriver().findElement(By.xpath("//a[@target]"));
            WebElement ForkMeOnGitHub=Driver.getDriver().findElement(By.xpath("//a[@href='https://github.com/tourdedave/the-internet']"));
            ElementalSelenium.click();
    
            //Window handle
            String currentWindowHandle=Driver.getDriver().getWindowHandle();
            Set<String> allWindowHandels=Driver.driver.getWindowHandles();
            System.out.println(allWindowHandels.size());
            for (String handle:allWindowHandels
                 ) {
                if (!handle.equals(currentWindowHandle))
                    Driver.getDriver().switchTo().window(handle);
            }
    
            Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"http://elementalselenium.com/");
    
            //Go back to the first window
            Driver.getDriver().switchTo().window(currentWindowHandle);
    
            //Click on the link by using jse
            JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();",ForkMeOnGitHub);
    
            Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://github.com/saucelabs/the-internet");
    
    
    
        }


    @AfterTest
    public void tear() {
        Driver.getDriver().quit();

    }
}
 