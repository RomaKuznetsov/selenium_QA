package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Radio extends BaseElement {

    public Radio(By by) {
        super(by);
    }

    public Radio(SelenideElement wrappedElement) {
        super(wrappedElement);
    }

    public void check() {
        this.getWrappedElement().click();
    }

}
