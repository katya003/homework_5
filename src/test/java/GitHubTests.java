import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTests {

    @BeforeAll
    static void setUp()  {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @AfterAll
    static void closeWindow() {
        WebDriverRunner.closeWindow();
    }

    @Test
    void readGitHubTests(){
        open("https://github.com/");
        $(".HeaderMenu-wrapper").find(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(exactText("The AI-powered developer platform."));

    }
}

