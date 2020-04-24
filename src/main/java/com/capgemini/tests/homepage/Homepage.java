package com.capgemini.tests.homepage;

import org.openqa.selenium.WebDriver;

import com.capgemini.tests.BasePageObject;

public class Homepage extends BasePageObject {

  public Homepage(WebDriver driver) {
    super(driver);
  }

  public Homepage open() {
    driver.get("https://automationintesting.online/");
    return this;
  }
}
