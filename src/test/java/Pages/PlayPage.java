package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PlayPage {
    SelenideElement linkElement = $x("//input[@class = 'copy-me__target']");
    SelenideElement closeButton = $x("//button[@class = 'text']");
    SelenideElement name2 = $x("//a[@id = 'user_tag']");

    public String getLink(){
        String link = linkElement.getAttribute("value");
        return link;
    }
    public void close(){
        name2.click();
        closeButton.click();
    }
}
