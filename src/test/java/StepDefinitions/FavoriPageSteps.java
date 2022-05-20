package StepDefinitions;

import Pages.FavoriPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FavoriPageSteps {
    @When("Favorilerime gidilir")
    public void favorilerimeGidilir() {
        FavoriPage.clickFav();

    }

    @Then("Urunun favorilerime eklendigi kontrol edilir")
    public void urununFavorilerimeEklendigiKontrolEdilir() {
        FavoriPage.favControl();

    }
}
