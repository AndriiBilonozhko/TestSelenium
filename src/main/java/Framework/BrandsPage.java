package Framework;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class BrandsPage {

    private final ElementsCollection brandsLocator =
            $$(By.xpath("//div[@id='product-manufacturer']//div[@class='col-sm-3']//a"));

    public ElementsCollection getAllBrands() {
        return (brandsLocator);
    }
}
