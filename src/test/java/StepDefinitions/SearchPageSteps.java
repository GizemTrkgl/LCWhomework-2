package StepDefinitions;
import Pages.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class SearchPageSteps {
    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    @Then("Search Page in geldigi kontrol edilir")
    public void searchPageInGeldigiKontrolEdilir() {
        searchPage.checkSearchPage();
    }

    @When("{int}. siradaki urune tiklanir")
    public void siradakiUruneTiklanir(int arg0) {
        searchPage.clickProduct();


    }
}
