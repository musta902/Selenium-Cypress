package tests;

import pages.Digest;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class digest_auth {
    HomePage homePage = new HomePage();
    Digest digest = new Digest();

    // // @BeforeClass
    // public void setup() {

    // Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    // ReusableMethods.waitForPageToLoad(10);
    // ReusableMethods.waitFor(5);

    @Test
    public void digest() {
        homePage.digest_Auth.click();
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.waitFor(5);
        String ab = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ab, "http://the-internet.herokuapp.com/digest_auth");
    }

    @Test
    public void tc202() {

        String credentials = "admin";
        Driver.getDriver()
                .get("https://" + credentials + ":" + credentials + "@the-internet.herokuapp.com/digest_auth");
        Assert.assertTrue(digest.gestpage.isDisplayed());

        // alert.accept();
        // //Cypress.Commands.add("auth_digest", (username, password, baseUrl, text) =>
        // {

        // cy.visit(baseUrl, {
        // auth: {
        // username: username,
        // password: password,
        // },
        // })
        // cy.get('p').should('include.text', text)
        // })

    }

    @Test
    public void tc203() {
        String credentials = "adr";
        Driver.getDriver()
                .get("https://" + credentials + ":" + credentials + "@the-internet.herokuapp.com/digest_auth");
            Assert.assertFalse(ReusableMethods.isExist(digest.gestpage)); 
     
              //  Assert.assertFalse(digest.gestpage.isDisplayed());

    }

    // @AfterClass
    // public void tear() {
    // Driver.getDriver().close();

}
