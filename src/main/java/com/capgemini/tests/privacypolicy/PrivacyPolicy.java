package com.capgemini.tests.privacypolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capgemini.tests.BasePageObject;

import io.qameta.allure.Step;

public class PrivacyPolicy extends BasePageObject {
  private static final Logger LOG = LoggerFactory.getLogger(PrivacyPolicy.class);

  @FindBy(css = "h1")
  private WebElement heading1;

  public PrivacyPolicy(WebDriver driver) {
    super(driver);
  }

  @Step("Opening the Privacy Policy page")
  public PrivacyPolicy open() {
    LOG.info("Opening page: privacy policy");
    driver.get("https://automationintesting.online/#/privacy");
    return this;
  }

  @Step("Extracting heading 1 text")
  public String getHeadingText() {
    return heading1.getText();
  }
}
