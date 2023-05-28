package pages;

import elements.*;
import org.openqa.selenium.By;

public class CheckoutPage {


    private final Input firstNameInput = new Input(By.id("first-name-input-id"));
    private final Input lastNameInput = new Input(By.id("last-name-input-id"));
    private final Selector countrySelector = new Selector(By.id("country-selector-id"));
    private final Selector citySelector = new Selector(By.id("city-selector-id"));
    private final Input zipInput = new Input(By.id("zip-input-id"));
    private final Checkbox saveInfoLbl = new Checkbox(By.id("save-info-lbl-id"));
    private final Radio cashLbl = new Radio(By.id("cash-info-lbl-id"));
    private final Radio creditCard = new Radio(By.id("credit-lbl-id"));
    private final Button continueBtn = new Button(By.id("continue-lbl-id"));

    public Input getFirstNameInput() {
        return firstNameInput;
    }

    public Input getLastNameInput() {
        return lastNameInput;
    }

    public Selector getCountrySelector() {
        return countrySelector;
    }

    public Selector getCitySelector() {
        return citySelector;
    }

    public Input getZipInput() {
        return zipInput;
    }

    public Checkbox getSaveInfoLbl() {
        return saveInfoLbl;
    }

    public Radio getCashLbl() {
        return cashLbl;
    }

    public Radio getCreditCard() {
        return creditCard;
    }

    public Button getContinueBtn() {
        return continueBtn;
    }
}
