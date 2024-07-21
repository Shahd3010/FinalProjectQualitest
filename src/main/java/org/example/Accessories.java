package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accessories {
    final public static String ACCESSORIES_CATEGORY="menu-item-671";
    final public static String PRODUCT_LINK="Anchor Bracelet";
    final public static String ADD_TO_CART="add-to-cart";


    public static void navigateToAccessories(WebDriver driver){
        WebElement  accessoriesCategory= driver.findElement(By.id(ACCESSORIES_CATEGORY));
        accessoriesCategory.click();
    }
    public static void navigateToProductInAccessories(WebDriver driver){
        navigateToAccessories(driver);
        WebElement  product= driver.findElement(By.linkText(PRODUCT_LINK));
        product.click();



    }
    public  static  void addProductInAccessories(WebDriver driver){
        navigateToProductInAccessories(driver);
        WebElement  product= driver.findElement(By.name(ADD_TO_CART));
        product.click();


    }
}
