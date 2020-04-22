package com.capgemini.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
  private WebDriver webDriver;

  @BeforeMethod
  public void setup() {
    WebDriverManager.chromedriver().setup();
    webDriver = new ChromeDriver();
  }

  @AfterMethod
  public void teardown() {
    webDriver.quit();
  }

  @Test
  public void openingPage() {
    webDriver.get("https://google.com");
  }

  @Test
  public void assertingTitle() {
    webDriver.get("https://the-internet.herokuapp.com/");

    String expectedTitle = "The Internet";
    String actualTitle = webDriver.getTitle();

    Assert.assertEquals(actualTitle, expectedTitle);
  }

  @Test
  public void controllingBrowser() {
    webDriver.get("https://the-internet.herokuapp.com/");
    webDriver.navigate().to("https://the-internet.herokuapp.com/");

    webDriver.manage().window().setSize(new Dimension(50, 500));
  }

  @Test
  public void interactingWithWebElement() {
    webDriver.get("https://the-internet.herokuapp.com/inputs");
    String expected = "12345";

    WebElement input = webDriver.findElement(By.cssSelector("input[type=number]"));
    input.sendKeys(expected);

    String actual = input.getAttribute("value");

    Assert.assertEquals(actual, expected);
  }

  @Test
  public void jsExecutor() {
    webDriver.get("https://the-internet.herokuapp.com/inputs");

    JavascriptExecutor jsExecutor = ((JavascriptExecutor)webDriver);
    jsExecutor.executeScript("console.log('heloł')");
  }
}
