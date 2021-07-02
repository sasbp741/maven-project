package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

/*  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";
    assertThat(greeter.greet(someone), containsString(someone));
    //test1 : doit inclure la string someone
  }
  */

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";
     String someone2 = "ola";

    assertThat(greeter.greet(someone), containsString(someone2));
    //essai de rendre le test failed, en rajoutant une 2eme personne
  }
  
  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "Boooooooooooooooooooooooooooooooooooooooooooooooooooooooooob";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length()))); 
    // test2 ce qui doit être retourné, doit être plus grand que la taille du "Hello babacar, Bob" - ça permet de voir qu'il y a un mot en plus
    //il doit dire plus que ce que ce qu'on lui donne cad Bob + Hello babacar
  }
}
