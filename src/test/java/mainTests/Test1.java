package mainTests;

import Framework.MainPage;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Test1 extends BaseTest {

    @Test
    public void testOne() {
        MainPage mainPage = new MainPage();
        List<String> expectedresult = Arrays.asList("Apple", "Canon", "Hewlett-Packard", "HTC",
                "Palm", "Sony");
        ElementsCollection actualResult = mainPage
                .clickBrands()
                .getAllBrands();

        actualResult.shouldHave(CollectionCondition.texts(expectedresult));
    }
}

