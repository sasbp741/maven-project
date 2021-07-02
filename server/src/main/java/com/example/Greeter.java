package com.example;


public class Greeter {

  
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);  // le %s affiche ce qu'on a mis dans someone
  }
}
