package selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.*;

public class FeaturesTest {

    protected final static String BASE_URL = "https://belgazprombank.by/";
    protected final static String PRODUCTS_URL = "https://belgazprombank.by/";
    protected final static String SUCCESS_URL = "https://belgazprombank.by/";

    @AfterMethod
    public void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }


    @Test
    public void findElements() {
        open(BASE_URL);
//      $(By.id("db")).click();
//      $$(byPartialLinkText("bitrix")).get(0).click();
        $(By.id("shou-products-btn")).click();
        $$(byId("buy-btn")).get(0).click();
    }

    @Test
    public void searchInnerElements() {
        open(PRODUCTS_URL);
        $$(byId("card-box")).get(3).$("by-btn").click();
        $$(byId("card-box")).get(3).$$("by-btn").get(5).click();
    }

    @Test
    public void assertions() {
        open(SUCCESS_URL);
//        $(byId("success-title")).should(Condition.exist);
//        $(byId("success-title")).should(Condition.visible);
//        $(byId("success-title")).should(Condition.exactText("text"));

        $(byId("success-title")).waitUntil(Condition.exist, 20000).shouldHave(Condition.exactText("Thank You"));

    }

    @Test
    public void assertions_2() {
        open(PRODUCTS_URL);
        $$(byId("buy-btn")).shouldBe(CollectionCondition.sizeGreaterThan(4)).get(3).click();

    }


//    @BeforeTest настройки селенида
//    public void configuration() {
//        Configuration.timeout = 20;
//        Configuration.remote = "grid url";
//    }
}
