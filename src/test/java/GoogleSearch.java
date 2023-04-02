import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {

private WebDriver webDriver;

    @Given("browser is open")
    public void browserIsOpen(){
    WebDriverManager.chromedriver().setup();
    }

    @And("user is on google page")
    public void userIsOnGooglePage(){

    }

    @When("usser enters 'skillfactoru' in search box")
    public void userEntersATextInSearchBox(){

    }

    @And("click on search button")
    public void hitsEnter()
    {

    }

    @Then("User is navigated to search results")
    public void userIsNavigatedToSearchResults(){

    }
}
