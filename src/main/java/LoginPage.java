import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage  {
    WebDriver driver;
    public LoginPage() {
        this.driver= MyDriver.getDriver();
    }
    public static final String USER_NAME = "standard_user";
    public static final String USER_PASSWORD = "secret_sauce";
    private static final By INPUT_USER_NAME = By.cssSelector("input#user-name");
    private static final By INPUT_USER_PASSWORD = By.cssSelector("input#password");
    private static final By CLICK_BTN_LOGIN = By.cssSelector("input#login-button");
    private static final By CLICK_FOR_PRISE = By.cssSelector("select.product_sort_container");
    private static final By SORT_LOW_TO_HIGH = By.xpath("//span[@class='select_container']");
    private static final By CLICK_PRISE_LOW_TO_HIGH = By.xpath("//option[@value='lohi']");
    public void open() {
        driver.get(Users.URL);
    }
    public LoginPage inputName(String name) {
        WebElement inputUserName = driver.findElement(INPUT_USER_NAME);
        inputUserName.sendKeys(name);
        return this;
    }
    public LoginPage inputPassword(String password) {
        WebElement inputUserPassword = driver.findElement(INPUT_USER_PASSWORD);
        inputUserPassword.sendKeys(password);
        return this;
    }
    public LoginPage clickBtnLogin() {
        WebElement clickBtnButton = driver.findElement(CLICK_BTN_LOGIN);
        clickBtnButton.click();
        return this;
    }
    public LoginPage sortForPrise() {
        WebElement clilkBtnSort = driver.findElement(SORT_LOW_TO_HIGH);
        clilkBtnSort.click();
        WebElement sortPriseLowToHigh = driver.findElement(CLICK_PRISE_LOW_TO_HIGH);
        sortPriseLowToHigh.click();
        return this;
    }
}
