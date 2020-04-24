package com.capgemini.tests.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.capgemini.tests.BaseTest;
import com.capgemini.tests.homepage.pageobjects.ContactForm;

public class HomepageTest extends BaseTest {

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
    contactForm
        .fillTheForm("Mr Tester", "example@example.com", "01234567890", "Testing if this works",
            "Hello sir,\n"
                + "\n"
                + "I'm testing this for the testing purposes!");
    contactForm.submitTheForm();

    Assert.assertTrue(contactForm.getText().contains("Thanks for getting in touch"));
  }

}
