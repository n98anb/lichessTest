package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AuthPage {
    SelenideElement passwordFirst = $x("//input[@name = 'password']");
    SelenideElement loginFirst = $x("//input[@name = 'username']");
    SelenideElement submitBurrotFirst = $x("//button[contains(text(), 'Войти')]");

    public AuthPage(String url){
        open(url);
    }

    public MainPage authFirst(String login, String password){
        passwordFirst.setValue(password);
        loginFirst.setValue(login);
        submitBurrotFirst.click();
        return new MainPage();
    }

}
