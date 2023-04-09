import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    public CartPage() {
        this.driver = MyDriver.getDriver();
    }
    private static final By CLICK_ADD_TO_CART = By.cssSelector("div button#add-to-cart-sauce-labs-onesie");
    private static final By CHECK_CART = By.cssSelector("a.shopping_cart_link");
    private static final String URL_CART = "https://www.saucedemo.com/inventory.html";
    public static final By CHECK_PRICE = By.cssSelector(".inventory_item_price");


    public void open() {
        driver.get(URL_CART);
    }
    public CartPage addToCartProduct() {
        WebElement addToCart = driver.findElement(CLICK_ADD_TO_CART);
        addToCart.click();
        return this;
    }
    public String getItemPrice() {
        WebElement checkToCart = driver.findElement(CHECK_CART);
        checkToCart.click();
        WebElement price = driver.findElement(CHECK_PRICE);
        return price.getText();
    }
}
