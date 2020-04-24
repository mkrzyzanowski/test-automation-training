package com.capgemini.tests.privacypolicy;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.capgemini.tests.BaseTest;

public class PrivacyPolicyTest extends BaseTest {
  @Test
  public void privacyPolicy() {
    PrivacyPolicy privacyPolicy = new PrivacyPolicy(driver);
    privacyPolicy.open();
    Assert.assertTrue(privacyPolicy.getHeadingText().equals("Privacy Policy Notice"));
  }
}
