package com.capgemini.tests.homepage;

import org.openqa.selenium.WebDriver;

public class Homepage {

  private WebDriver driver;

  public Homepage(WebDriver driver) {
    this.driver = driver;
  }

  public Homepage open() {
    driver.get("https://automationintesting.online/");
    return this;
  }
}
