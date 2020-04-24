package com.capgemini.functionalTests.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrivacyPolicy {
  private static final Logger LOG = LoggerFactory.getLogger(PrivacyPolicy.class);

  @FindBy(css = "h1")
  private WebElement heading1;

  private WebDriver driver;

  public PrivacyPolicy(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void open()  {
    LOG.info("Opening page: privacy policy");
    driver.get("https://automationintesting.online/#/privacy");
  }

  public String getHeadingText() {
    return heading1.getText();
  }
}
