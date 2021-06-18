package com.example;


/**
* <p>
* Class main.
* Please see the {@link com.baeldung.javadoc.Person} class for true identity.
* @author Captain America
* @version 1.0
* @since 18/06/2021
* </p>
* This method always returns a welcome message.
*/
public class Greeter {
/**
*Cretes an empty constructor.
*/
  public Greeter() {

  }
/** Method return "hello".
* @param someone nom de l'utilisateur
* @return string welcome message
*/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
