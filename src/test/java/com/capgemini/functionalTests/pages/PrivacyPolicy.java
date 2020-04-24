package com.capgemini.functionalTests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.qameta.allure.Step;

public class PrivacyPolicy {
  private static final Logger LOG = LoggerFactory.getLogger(PrivacyPolicy.class);

  @FindBy(css = "h1")
  private WebElement heading1;

  private WebDriver driver;

  public PrivacyPolicy(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @Step("Opening Privacy Policy page!")
  public void open() {
    driver.get("https://automationintesting.online/#/privacy");
    LOG.info("Visiting the Privacy Policy page");
  }

  @Step("Retrieving heading text")
  public String getHeadingText() {
    return heading1.getText();
  }
}
