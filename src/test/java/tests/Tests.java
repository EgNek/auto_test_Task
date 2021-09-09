package tests;

import framework.driver.DriverUtils;
import framework.pageObjects.AuthorizationPage;
import framework.pageObjects.PersonalAccountPage;
import framework.utils.ConfPropertiesManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest{

    AuthorizationPage authorizationPage = new AuthorizationPage();
    PersonalAccountPage personalAccountPage = new PersonalAccountPage();

    @Test
    public void doBasicAuth(){

        DriverUtils.getStartUrl();
        authorizationPage.setLogin(ConfPropertiesManager.getProperty("test.login"));
        authorizationPage.setPassword(ConfPropertiesManager.getProperty("test.password"));
        authorizationPage.clickSubmitBtn();
        Assert.assertTrue(personalAccountPage.pageIsPresent(),"Authorization failed !");
    }
}
