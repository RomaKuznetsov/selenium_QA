package selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class VideoTest {
    private final String BASE_URL = "https://github.com/RomaKuznetsov";

    @Test
    private void test() throws InterruptedException {
        open(BASE_URL);
        SelenideElement video = $(By.tagName("video"));
        executeJavaScript("arguments[o].scrollIntoView(true);", video);
        Thread.sleep(5000);

        String src = executeJavaScript("argument[0].currentSrc", video);
        System.out.println(src);
        Double duration = executeJavaScript("argument[0].duration", video);
        System.out.println(duration);

        video.click();

        Thread.sleep(5000);
        executeJavaScript("argument[0].play()", video);
        Thread.sleep(5000);
        executeJavaScript("argument[0].pause()", video);
        Thread.sleep(5000);
        executeJavaScript("argument[0].play()", video);







    }


}
