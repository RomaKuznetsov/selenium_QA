package pages.blocks.products;

import com.codeborne.selenide.SelenideElement;
import elements.Button;
import elements.Label;
import org.openqa.selenium.By;

public class Card {

    private final Label titleLbl;
    private final Button buyBtn;

    public Card(SelenideElement root) {
        this.titleLbl = new Label(root.$(By.id("card-title")));
        this.buyBtn = new Button(root.$(By.id("buy-btn")));
    }
    public void buy() {
        buyBtn.click();
    }
}
