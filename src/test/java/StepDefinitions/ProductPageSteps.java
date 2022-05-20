package StepDefinitions;

import Pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps {

    @Then("Product Page in acildigi kontrol edilir")
    public void productPageInAcildigiKontrolEdilir() {
        ProductPage.checkProductPage();


    }

    @When("Favoriye tiklanir")
    public void favoriyeTiklanir() {
        ProductPage.clickFav();
        
    }


}
