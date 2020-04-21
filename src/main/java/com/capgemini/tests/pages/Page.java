package com.capgemini.tests.pages;

public abstract class Page {
  protected String url;
  protected String title;

  public Page(String url, String title) {
    this.url = url;
    this.title = title;
  }

  public void open() {
    System.out.println("Opening page: " + title);
  }

  public String getTitle() {
    return title;
  }

  //todo parametrized open?
}
