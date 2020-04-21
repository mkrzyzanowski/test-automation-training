package com.capgemini.tests.pages;

public interface Closeable {
  default void close() {
    System.out.println("Default closing");
  }
}
