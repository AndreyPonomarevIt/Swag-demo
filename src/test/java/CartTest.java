
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import
public class CartTest extends BaseTest {
    public static final String PRICE = "$7.99";
    CartPage cartPage = new CartPage();
    LoginStep loginStep = new LoginStep();
    @Test
    public void addToCart() {
        loginStep.inputLoginForm();
        String itemPrice = cartPage.addToCartProduct()
                .getItemPrice();
        Assertions.assertThat(itemPrice).as("Incorrect amount value").isEqualTo(PRICE);
    }
}
