package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    static By productPage = By.cssSelector("#rightInfoBar > div:nth-child(3) > div > div > a > div > div");
    static By favIcon = By.cssSelector("#add-to-favorite-detail");
    static WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public static void checkProductPage(){
        driver.findElement(productPage);
    }
    public static void clickFav(){
        driver.findElement(favIcon).click();
    }

}
