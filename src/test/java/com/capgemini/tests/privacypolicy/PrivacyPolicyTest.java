package com.capgemini.tests.privacypolicy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.capgemini.tests.BaseTest;

import io.qameta.allure.Description;

public class PrivacyPolicyTest extends BaseTest {

  private static final String PRIVACY_POLICY_NOTICE = "Privacy Policy Notice";

  @Test(description = "Testing Privacy Policy Heading 1")
  @Description("Checking the correctness of the heading 1")
  public void expectingCorrectHeading1() {
    PrivacyPolicy privacyPolicy = new PrivacyPolicy(driver);

    privacyPolicy.open();

    String actualHeadingText = privacyPolicy.getHeadingText();

    assertEquals(actualHeadingText, PRIVACY_POLICY_NOTICE,
        "Heading 1 was not the correct one");

    assertThat(actualHeadingText).as("Checking if heading is correct")
        .isEqualTo(PRIVACY_POLICY_NOTICE);
  }
}
