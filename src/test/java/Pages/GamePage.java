package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GamePage {
    SelenideElement cancelGameButton = $x("//button[@class = 'fbt abort']");

    public SelenideElement getCancelButton(){
        return cancelGameButton;
    }
}
