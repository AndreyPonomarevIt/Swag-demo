import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {


    @BeforeEach
    public void beforeDriver() {
        MyDriver.getDriver();
    }

   @AfterEach
    public void closeDriver() { MyDriver.closeDriver();
    }
}

