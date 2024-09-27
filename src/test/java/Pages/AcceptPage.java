package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AcceptPage {
    SelenideElement acceptButton = $x("//button[@class= 'text button button-fat']");

//    public AcceptPage(String url){
//        open(url);
//    }

    public GamePage acceptChallenge(){
        acceptButton.click();
        return new GamePage();
    }
}
