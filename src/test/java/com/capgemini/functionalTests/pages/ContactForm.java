package com.capgemini.functionalTests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactForm {

  @FindBy(css = ".row.contact")
  private WebElement row;

  @FindBy(css = ".row.contact form")
  private WebElement form;

  @FindBy(css = "#name")
  private WebElement nameInput;

  @FindBy(css = "#email")
  private WebElement emailInput;

  @FindBy(css = "#phone")
  private WebElement phoneInput;

  @FindBy(css = "#subject")
  private WebElement subjectInput;

  @FindBy(css = "#description")
  private WebElement descriptionInput;

  @FindBy(css = "#submitContact")
  private WebElement submitButton;

  private WebDriver driver;

  public ContactForm(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public boolean isDisplayed() {
    if (form.isDisplayed()) {
      return true;
    }
    return false;
  }

  public void fillTheForm(String name, String email, String phone, String subject,
      String message) {
    nameInput.sendKeys(name);
    emailInput.sendKeys(email);
    phoneInput.sendKeys(phone);
    subjectInput.sendKeys(subject);
    descriptionInput.sendKeys(message);
  }

  public void submitTheForm() {
    submitButton.click();
  }

  public String getText() {
    return row.getText();
  }
}
