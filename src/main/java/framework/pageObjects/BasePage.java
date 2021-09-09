package framework.pageObjects;

import framework.driver.DriverUtils;
import org.openqa.selenium.By;

public class BasePage {

    public String nameOfPage;
    public By locator;

    public BasePage(By locator, String nameOfPage){
        this.locator = locator;
        this.nameOfPage = nameOfPage;
    }

    public boolean pageIsPresent(){
        return DriverUtils.getInstance().findElements(locator).isEmpty();
    }

    public BasePage(){}
}
