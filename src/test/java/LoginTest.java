
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    LoginStep loginStep = new LoginStep();

    @Test
    public void loginForm() {
        loginStep.inputLoginForm();
    }
}
