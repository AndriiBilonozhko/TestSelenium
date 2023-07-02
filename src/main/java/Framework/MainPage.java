package Framework;

import Framework.BrandsPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement brandsLocator =
            $(By.xpath("//li/a[contains(text(),'Brands')]"));

    public BrandsPage clickBrands() {
        brandsLocator.click();
        return new BrandsPage();
    }

}
