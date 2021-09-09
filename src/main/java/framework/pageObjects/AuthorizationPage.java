package framework.pageObjects;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;

public class AuthorizationPage extends BasePage {

    private final TextField LOGIN_FIELD = new TextField(By.xpath("//*[@name='user']"),"login field ");
    private final TextField PASSWORD_FIELD = new TextField(By.xpath("//*[@name='password']"),"password field ");
    private final Button SUBMIT_BTN = new Button(By.xpath("//button[@type='submit']"),"submit btn");

    public void setLogin (String login){LOGIN_FIELD.sendKeys(login);}

    public void setPassword (String password){PASSWORD_FIELD.sendKeys(password);}

    public void clickSubmitBtn(){
        SUBMIT_BTN.click();
    }
}
