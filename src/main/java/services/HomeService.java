package services;

import pages.HomePage;

public class HomeService {

    private final HomePage homePage = new HomePage();

    public void openProducts() {
        homePage.getNavBar().openProducts();
    }
}
