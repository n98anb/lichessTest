package Tests;

import Pages.AcceptPage;
import Pages.AuthPage;
import Pages.PlayPage;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

import static com.codeborne.selenide.Condition.visible;

public class lichessTest extends BaseTest {
    public final static String URL = "https://lichess.org/login";

    AuthPage authPage = new AuthPage(URL);
    String linkForGame = "";

    /*
    Проверка авторизации
    */
    @Test
    public void autorizationTest(){
        Assert.assertEquals(authPage.authFirst(botFirstLogin, botFirstPassword).getName(), botFirstLogin);
    }

    /*
    Создает партию с другом, принимает ее и проверяет, началась ли партия
     */
    @Test
    public void checkCreatedChallengeAndAcceptIt(){
        linkForGame = authPage.authFirst(botFirstLogin, botFirstPassword).clickOnPlayButton().getLink();
        PlayPage playPage = new PlayPage();
        playPage.close();
        Selenide.switchTo().newWindow(WindowType.WINDOW);
        Selenide.open(linkForGame);
        AcceptPage acceptPage = new AcceptPage();
        Assert.assertTrue(acceptPage.acceptChallenge().getCancelButton().is(visible));
    }
}
