package selenide;


import enums.City;
import enums.Country;
import enums.PaymentType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductsPage;
import pages.SuccessPage;
import services.CheckoutService;
import services.HomeService;
import services.ProductsService;
import services.SuccessService;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

public class CheckOutTest {
    private final String BASE_URL = "https://github.com/RomaKuznetsov";
    private HomePage homePage;
    private ProductsPage productsPage;
    private CheckoutPage checkoutPage;
    private SuccessPage successPage;

    private final HomeService homeService = new HomeService();
    private final CheckoutService checkoutService = new CheckoutService();
    private final ProductsService productsService = new ProductsService();
    private final SuccessService successService = new SuccessService();

    @BeforeMethod
    public void openSite() {
        open(BASE_URL);
    }

    @Test
    public void test() {
        homeService.openProducts();
        productsService.buyRandomProducts();
        checkoutService.performCheckout("Roman", "Kuznetsov", Country.BELARUS, City.MINSK,
                "230000", true, PaymentType.CASH);
        assertTrue(successService.isPageShown());
    }
}
