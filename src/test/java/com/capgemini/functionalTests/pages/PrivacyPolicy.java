package com.capgemini.functionalTests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy {

  @FindBy(css = "h1")
  private WebElement heading1;

  private WebDriver driver;

  public PrivacyPolicy(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void open() {
    driver.get("https://automationintesting.online/#/privacy");
  }

  public String getHeadingText() {
    return heading1.getText();
  }
}
