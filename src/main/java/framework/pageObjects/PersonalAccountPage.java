package framework.pageObjects;

import org.openqa.selenium.By;

public class PersonalAccountPage extends BasePage {


    public PersonalAccountPage(){
    super(By.xpath("//div[@class='mira-wrap-header']"),"Personal Account Page");

}

}
