package com.capgemini.tests.pages;

public class Homepage extends Page implements Closeable {
  public Homepage() {
    super("Homepage");
  }

  @Override
  protected String getUrl() {
    return "www.capgemini.com";
  }

  @Override
  public void close() {
    System.out.println("special CLOSING!!");
  }
}
