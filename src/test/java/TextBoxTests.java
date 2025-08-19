import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @Test
    void fillFormTest(){
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Shamil Khayrov");
        $("#userEmail").setValue("Shamil@Khayrov.com");
        $("#currentAddress").setValue("Some address1");
        $("#permanentAddress").setValue("Some address2");
        $("#submit").click();

        $("#output").shouldHave(text("Shamil Khayrov"), text("Shamil@Khayrov.com"), text("Some address1"), text("Some address2"));
    }
}
