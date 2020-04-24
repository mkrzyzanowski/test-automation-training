package com.capgemini.tests;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RefactoringDataProviders {

  @DataProvider(name = "test")
  public Object[][] dataSet() {
    List<String> testData = Arrays.asList("one", "two", "three");
    return testData.stream().map(s -> new Object[] {s}).toArray(Object[][]::new);
  }

  @Test(dataProvider = "test")
  public void usingTestData(String s) {
    Assert.assertFalse(s.isEmpty());
  }

}
