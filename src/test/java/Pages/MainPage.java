package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    //SelenideElement name = $x("//a[(text())= 'ChessMasterProElite']");
    SelenideElement name = $x("//a[@id = 'user_tag']");
    SelenideElement playButton = $x("//button[text() = 'Сыграть с другом']");
    SelenideElement createPlayButton = $x("//button[@class='button button-metal color-submits__button random']");

    public String getName(){
        return name.text();
    }

    public PlayPage clickOnPlayButton(){
        playButton.click();
        createPlayButton.click();
        return new PlayPage();
    }


}
