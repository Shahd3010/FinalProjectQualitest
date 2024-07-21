package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.PanelUI;

public class StoreCategory {
    final public static String SEARCH_FIELD="wc-block-search__input-1";
    final public static String SEARCH_ENTER ="wc-block-product-search__button";
    final public static String SORT_ICON ="orderby";
    public static void searchForProduct(WebDriver driver,String productName){
        WebElement searchField = driver.findElement(By.id(SEARCH_FIELD));
        searchField.sendKeys(productName);
        WebElement searchEnter=driver.findElement(By.className(SEARCH_ENTER));
        searchEnter.click();
    }
    public static void sortProducts(WebDriver driver){
        Select sortIcon =new Select(driver.findElement(By.className(SORT_ICON)));
        sortIcon.selectByVisibleText("Sort by latest");

    }
}
