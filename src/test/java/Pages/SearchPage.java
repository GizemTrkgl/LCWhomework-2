package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    By searchPageLogo = By.cssSelector("#icon-angle-left.lcw-breadcrumb__item-list__back-icon");
    By product = By.cssSelector("img[src=\"https://img-lcwaikiki.mncdn.com/mnresize/600/-/pim/productimages/20212/5352738/l_20212-w1cp29z8-cwn_a.jpg\"]");
    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    public void checkSearchPage(){
        driver.findElement(searchPageLogo);
    }
    public void clickProduct(){
        driver.findElement(product).click();
    }
}
