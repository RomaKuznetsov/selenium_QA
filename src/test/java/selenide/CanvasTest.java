package selenide;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class CanvasTest {
    private final String BASE_URL = "https://github.com/RomaKuznetsov";

    @Test
    private void test() throws InterruptedException {
        open(BASE_URL);
        SelenideElement canvas = $(BASE_URL + "canvas.html");
        actions().clickAndHold(canvas).moveByOffset(10, 50)
                .moveByOffset(50, 10).moveByOffset(-10, -50)
                .moveByOffset(-50, -10).perform();
        Thread.sleep(5000);
    }


}
