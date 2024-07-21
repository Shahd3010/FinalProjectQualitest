package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contacts {
    final public static String CONTACT_NAV_LINK= "menu-item-829";
    final public static String NAME= "wpforms-15-field_0";
    final public static String SUBJECT= "wpforms-15-field_5";
    final public static String EMAIL= "wpforms-15-field_4";
    final public static String MESSAGE= "wpforms-15-field_2";
    final public static String SEND_MESSAGE_BUTTON= "wpforms-submit-15";


    public static void navigateToContactUs(WebDriver driver){
        driver.findElement(By.id(CONTACT_NAV_LINK)).click();

    }

    public static void fillContactUsForm(WebDriver driver, String name,String subject, String email,String message){
        navigateToContactUs(driver);
        WebElement nameFiled=driver.findElement(By.id(NAME));
        nameFiled.sendKeys(name);
        WebElement subjectField = driver.findElement(By.id(SUBJECT));
        subjectField.sendKeys(subject);
        WebElement emailFiled = driver.findElement(By.id(EMAIL));
        emailFiled.sendKeys(email);
        WebElement messageFiled = driver.findElement(By.id(MESSAGE));
        messageFiled.sendKeys(message);
        WebElement sendMessage = driver.findElement(By.id(SEND_MESSAGE_BUTTON));
        sendMessage.click();
    }





}
