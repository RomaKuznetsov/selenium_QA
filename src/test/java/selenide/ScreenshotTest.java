package selenide;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.JqueryCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;

public class ScreenshotTest {
    private final String BASE_URL = "https://github.com/RomaKuznetsov";

    @Test
    public void element() {
        open(BASE_URL);
        File pngFile = $(By.tagName("")).screenshot();
        System.out.println(pngFile.getAbsoluteFile());
    }

    @Test
    public void page() {
        open(BASE_URL + "/locators.html");
        String pngFile = screenshot("page.png");
        System.out.println(pngFile);
    }

    @Test
    public void fullPage() throws IOException {
        open(BASE_URL + "/locators.html");
        final Long devicePixelRatio = executeJavaScript("return windows.devicePixelRatio");


        final AShot ashot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(ShootingStrategies.scaling(Float.valueOf(devicePixelRatio + "f")), 100)).coordsProvider(new JqueryCoordsProvider());

        Screenshot screenshot = ashot.takeScreenshot(WebDriverRunner.getWebDriver());
        ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir") + "screen.png"));
    }





}
