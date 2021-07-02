/**
* Javadoc du package.
*/
package com.example;
/**
 * <p>
 * De plus, un Zéro a une liste d'amis Zéro.
 * des amis à cette liste.
 * </p>
 * @see SDZLevel
 * @author dworkin
 * @version 3.0
 * this is a class
 */
public class Greeter {
      /**
 * this is a constructor.
 */
  public Greeter() {
  }
/**
 * @param someone name of a person
 *@return greeting string
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
    // le %s affiche ce qu'on a mis dans someone
  }
}
