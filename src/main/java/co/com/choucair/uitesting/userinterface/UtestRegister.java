package co.com.choucair.uitesting.userinterface;

import net.serenitybdd.core.pages.PageObjects;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UtestRegister extends PageObjects {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div/div/unauthenticated-header/div/div/ul/li/a[contains(text(),'Join Today')]"));
    public static final Target INPUT_DATA = Target.the("where do we write the user").located(By.id("firstName"));
    public static final Target INPUT_USER = Target.the("where do we write the user").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the user").located(By.id("email"));
    public static final Target SELECT_MENU = Target.the("Month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("Day").located(By.id("birthDay"));
    public static final Target SELECT_AGE = Target.the("Age").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("next menu").located(By.xpath("//section/div/div/div/div[@class='ui-view']//div/form/div/a/span[contains(text(),'Next: Location')]"));
    public static final Target INPUT_CITY = Target.the("select the city").located(By.id("city"));
    public static final Target BACK = Target.the("back").located(By.xpath("//div/form/div/a/span"));
    public static final Target NEXT = Target.the("next menu").located(By.xpath("//section/div/div/div/div[@class='ui-view']//div/form/div/a/span[contains(text(),'Next: Location')]"));
    public static final Target NEXT_BUTTON2 = Target.the("next menu1").located(By.xpath("//section/div/div/div/div[@class='ui-view']//div/form/div/div/a/span[contains(text(),'Next: Devices')]"));
    public static final Target BACK2 = Target.the("back").located(By.xpath("(//div/div/div/div/div/a)[2]//span"));
    public static final Target NEXT2 = Target.the("next menu").located(By.xpath("//section/div/div/div/div[@class='ui-view']//div/form/div/div/a/span[contains(text(),'Next: Devices')]"));
    public static final Target NEXT_LAST = Target.the("next menu2").located(By.xpath("//section/div/div/div/div[@class='ui-view']//div/a/span[contains(text(),'Next: Last Step')]"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the user").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASS = Target.the("where do we write the user").located(By.id("confirmPassword"));
    public static final Target ENTER_VERIFI1 = Target.the("button to confirm login").located(By.xpath("//div/div/div/div/form/div/label/span"));
    public static final Target ENTER_VERIFI2 = Target.the("button to confirm login").located(By.xpath("(//div/div/div/div/form/div/label/span)[2]"));
    public static final Target ENTER_VERIFI3 = Target.the("button to confirm login").located(By.xpath("(//div/div/div/div/form/div/label/span)[4]"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//div/div/div/div/a/span[contains(text(),'Complete Setup')]"));

    public UtestRegister(WebDriver driver) {
        super(driver);

    }
}
