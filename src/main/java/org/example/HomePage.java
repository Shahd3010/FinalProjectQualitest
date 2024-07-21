package org.example;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    final public static String STORE_CATEGORY="//*[@id=\"menu-item-45\"]/a";
    final public static String CART_ICON ="ast-cart-menu-wrap";
    final public static String SEARCH_FIELD="ast-search-icon";
    final public static String SEARCH_INPUT="search-field";



    public static void navigateToStore(WebDriver driver){
        WebElement store=driver.findElement(By.xpath(STORE_CATEGORY));
        store.click();
    }
    public static void navigateToCart(WebDriver driver){
        WebElement cart=driver.findElement(By.className(CART_ICON));
        cart.click();
    }
    public static void searchInput(WebDriver driver,String productName){
        WebElement searchField = driver.findElement(By.className(SEARCH_FIELD));
        searchField.click();
        WebElement searchInput =driver.findElement(By.className(SEARCH_INPUT));
        searchInput.sendKeys(productName);
        searchInput.submit();
    }
}
