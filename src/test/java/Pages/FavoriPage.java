package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoriPage {
    static By fav = By.cssSelector("[href=\"/tr-TR/TR/favorilistem\"]");

    static By favories = By.cssSelector("#model_1773383_5352738 > div.picture-box > img.product-lazy-image.lazyloaded");
    static WebDriver driver;
    public FavoriPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickFav(){
        driver.findElement(fav).click();
    }
    public static void favControl(){
        driver.findElement(favories);
    }
}
