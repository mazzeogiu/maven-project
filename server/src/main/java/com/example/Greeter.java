package com.example;


/**
* Class main 
*
* @param  someone  name of user
* @return      welcome message
*/
public class Greeter {

  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
