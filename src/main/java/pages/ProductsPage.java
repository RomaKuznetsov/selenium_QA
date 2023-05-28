package pages;

import elements.Collection;
import org.openqa.selenium.By;
import pages.blocks.products.Card;



public class ProductsPage {
  private final Collection<Card> cardList = new Collection<Card>(Card.class, By.id("card-box"));

    public Collection<Card> getCardList() {
        return cardList;
    }
}
