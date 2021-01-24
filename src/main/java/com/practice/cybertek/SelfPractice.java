package com.practice.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SelfPractice {
    public static void main(String[] args) {

    }

    @Test
    public static void login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
    driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
   WebElement passwordTextBox= driver.findElement(By.xpath("//input[@type='password']"));
   passwordTextBox.sendKeys("Hum@nhrm123");
   driver.findElement(By.xpath("//input[@type='submit']")).click();

}
@Test
       public static void Page2(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php");
    driver.findElement(By.id("isAgeSelected")).click();
    driver.findElement(By.xpath("//a[text()='Table']")).click();
    driver.findElement(By.linkText("Table Data Download")).click();
    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("coll");
    System.out.println("second commit");


}

}
