package com.capgemini.tests.pages;

public class SearchResults extends Page implements Closeable {
  public SearchResults() {
    super("Search results");
  }

  @Override
  public void open() {
    System.out.println("SPECIAL TREATMENT FOR SEARCH");
    super.open();
  }

  @Override
  protected String getUrl() {
    return "www.capgemini.com/search-results";
  }
}
