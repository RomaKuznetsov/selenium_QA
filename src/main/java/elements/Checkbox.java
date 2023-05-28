package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Checkbox extends BaseElement {

    public Checkbox(By by) {
        super(by);
    }

    public Checkbox(SelenideElement wrappedElement) {
        super(wrappedElement);
    }

    public void check() {
        this.getWrappedElement().click();
    }

}
