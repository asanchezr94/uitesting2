package co.com.choucair.uitesting.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchLoginPage extends PageObject {
    public static final Target LOGIN = Target.the("button that shows us the form to login").located(By.xpath("//div/div/ul/li/a"));
    public static final Target FORGOUT = Target.the("button that shows forgout password").located(By.xpath("//div/div/div/form/main/section/div/span/a"));
    public static final Target EMAIL = Target.the("enter email registred").located(By.id("username"));
    public static final Target RESET = Target.the("button reset").located(By.id("reset-password-btn"));
    public static final Target SINGIN = Target.the("singin").located(By.xpath("//h1[contains(text(),'Sign in to uTest')]"));


    public SearchLoginPage(WebDriver driver) {
        super(driver);

    }
}
