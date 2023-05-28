package services;

import pages.CheckoutPage;
import pages.SuccessPage;

public class SuccessService {

  private final SuccessPage successPage = new SuccessPage();

public boolean isPageShown() {
  return successPage.getSuccessTitle().isDisplayed();
}

}
