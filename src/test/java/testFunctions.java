import org.example.Accessories;
import org.example.Contacts;
import org.example.HomePage;
import org.example.StoreCategory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing {
    WebDriver driver= new ChromeDriver();

    @BeforeTest
    public void setUp(){
        driver.get("https://atid.store/");
        driver.manage().window().maximize();
    }

    @Test
    public void storeNavigateWork(){
        HomePage.navigateToStore(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://atid.store/store/");
    }
    @Test
    public void cartNavigateWork(){
        HomePage.navigateToCart(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://atid.store/cart-2/");
    }
    @Test
    public void searchInHomePage(){
        HomePage.searchInput(driver,"tshirt");
        Assert.assertEquals(driver.getCurrentUrl(), "https://atid.store/?s=tshirt");

    }
    @Test
    public void storeSearchProduct(){
        HomePage.navigateToStore(driver);
        StoreCategory.searchForProduct(driver,"ATID Green Shoes");
        Assert.assertEquals(driver.getCurrentUrl(), "https://atid.store/product/atid-green-shoes/");
    }
    @Test
    public void sortProductSortByLatest(){
        HomePage.navigateToStore(driver);
        StoreCategory.sortProducts(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://atid.store/store/?orderby=date");

    }
    @Test

    public void navigateToContactUsValid(){
        Contacts.navigateToContactUs(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://atid.store/contact-us/");


    }
    @Test
    public void testValidContact(){
        Contacts.fillContactUsForm(driver, "shahd", "hi","shahdno2001@gmail.com", "hii");
        Assert.assertTrue(driver.getPageSource().contains("Thanks for contacting us! We will be in touch with you shortly."));
    }
    @Test
    public void testNotValidContact(){
        Contacts.fillContactUsForm(driver, "shahd", "hi","shahdno2001", "hii");
        Assert.assertTrue(driver.getPageSource().contains("Please enter a valid email address."));
    }
    @Test
    public void navigateToProductInAccessoriesWork(){
        Accessories.navigateToProductInAccessories(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://atid.store/product/anchor-bracelet/");
    }
    @Test
    public void addProductToCart(){
        Accessories.addProductInAccessories(driver);
        WebElement successAlert = driver.findElement(By.className("woocommerce-message"));
        String expectedAlertText = "“Anchor Bracelet” has been added to your cart.";
        String actualAlertText = successAlert.getText();
        Assert.assertTrue(actualAlertText.contains(expectedAlertText), "Alert text does not match.");
    }



}
