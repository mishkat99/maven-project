package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param String to input
   * @return hello input
   **/

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
