package com.capgemini.functionalTests;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capgemini.functionalTests.pages.ContactForm;
import com.capgemini.functionalTests.pages.PrivacyPolicy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClientTests {
  private WebDriver driver;

  @BeforeMethod
  public void setup() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }

  @AfterMethod
  public void teardown() {
    driver.quit();
  }

  @Test
  public void checkTitle() {
    driver.get("https://automationintesting.online/");

    Assert.assertEquals(driver.getTitle(), "Restful-booker-platform demo");
  }

  @Test
  public void checkHeading2() {
    driver.get("https://automationintesting.online/");

    driver.manage().addCookie(new Cookie("welcome", "true"));
    driver.navigate().refresh();

    String text = driver.findElement(By.xpath("//h2")).getText();
    Assert.assertEquals(text, "Rooms");
  }

  @Test
  public void fillingForm() {
    driver.get("https://automationintesting.online/");

    driver.manage().addCookie(new Cookie("welcome", "true"));
    driver.navigate().refresh();

    ContactForm contactForm = new ContactForm(driver);
    contactForm.fillTheForm("Mr Tester", "example@example.com", "01234567890", "Testing if this works", "Hello sir,\n"
        + "\n"
        + "I'm testing this for the testing purposes!");
    contactForm.submitTheForm();

    Assert.assertTrue(contactForm.getText().contains("Thanks for getting in touch"));
  }

  @Test
  public void privacyPolicy() {
    PrivacyPolicy privacyPolicy = new PrivacyPolicy(driver);
    privacyPolicy.open();
    Assert.assertTrue(privacyPolicy.getHeadingText().equals("Privacy Policy Notice"));
  }

}
