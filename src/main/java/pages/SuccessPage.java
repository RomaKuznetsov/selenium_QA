package pages;

import elements.Label;
import org.openqa.selenium.By;

public class SuccessPage {
    private final Label successTitle = new Label (By.id("success-title"));

    public Label getSuccessTitle() {
        return successTitle;
    }
}
