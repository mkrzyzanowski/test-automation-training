package com.capgemini.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngPlayground {

  @Test(description = "This is my test that compares 1 and 2", enabled = false)
  public void firstTest() {
    System.out.println("DOES IT WORK?!");

    int tested = 1;
    int expected = 2;

    Assert.assertEquals(tested, expected);
  }

  @Test
  public void enabled() {
    System.out.println("runs");
  }

  @DataProvider(name = "test-data")
  public Object[][] createData() {
    return new Object[][] {
        {"Data1", "1"},
        {"Data2", "2"},
        {"Data3", "3"}
    };
  }

  @Test(dataProvider = "test-data")
  public void testWithDataProvider(String name, String value) {
    System.out.println(String.format("data: %s, value: %s", name, value));
  }
}
