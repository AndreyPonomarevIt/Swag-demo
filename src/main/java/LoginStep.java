import org.openqa.selenium.WebDriver;

public class LoginStep  {
    LoginPage loginPage = new LoginPage();
    public void inputLoginForm() {
        loginPage.open();
        loginPage.inputName(LoginPage.USER_NAME)
                .inputPassword(LoginPage.USER_PASSWORD)
                .clickBtnLogin()
                .sortForPrise();
    }
}
