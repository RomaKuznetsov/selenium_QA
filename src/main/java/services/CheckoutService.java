package services;

import enums.City;
import enums.Country;
import enums.PaymentType;
import pages.CheckoutPage;

public class CheckoutService {

    private final CheckoutPage checkoutPage = new CheckoutPage();

    public void performCheckout(final String firstName, final String lastName, final Country country, final City city, final String zip, final boolean saveInfo, final PaymentType paymentType) {
        checkoutPage.getFirstNameInput().clearAndType(firstName);
        checkoutPage.getLastNameInput().clearAndType(lastName);
        checkoutPage.getCountrySelector().select(country.getCountryName());
        checkoutPage.getCitySelector().select(city.getCityName());
        checkoutPage.getZipInput().clearAndType(zip);
        if (saveInfo) {
            checkoutPage.getSaveInfoLbl().check();
        }
        switch (paymentType) {
            case CASH -> checkoutPage.getCashLbl().check();
            case CREDIT_CARD -> checkoutPage.getCreditCard().check();
        }
        checkoutPage.getContinueBtn().click();
    }
}
