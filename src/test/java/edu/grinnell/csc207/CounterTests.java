package edu.grinnell.csc207;

import edu.grinnell.csc207.util.Counter;
import edu.grinnell.csc207.util.BasicCounter;
import edu.grinnell.csc207.util.Tally;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of our counter class.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class CounterTests {
 /**
   * Some basic tests of our BasicCounter objects.
   */
  @Test
  public void test1() throws Exception {
    Counter alpha = new Tally();
    Counter beta = new BasicCounter(123);
    Counter gamma = new BasicCounter(-5);
    assertEquals(0, alpha.get(), "original alpha");
    assertEquals(123, beta.get(), "original beta");
    assertEquals(-5, gamma.get(), "original gamma");
    for (int i = 0; i < 10; i++) {
      alpha.increment();
      beta.increment();
      gamma.increment();
    } // for
    assertEquals(10, alpha.get(), "updated alpha");
    assertEquals(133, beta.get(), "updated beta");
    assertEquals(5, gamma.get(), "updated gamma");
    alpha.reset();
    beta.reset();
    gamma.reset();
    assertEquals(0, alpha.get(), "reset alpha");
    assertEquals(123, beta.get(), "reset beta");
    assertEquals(-5, gamma.get(), "reset gamma");
  } // test1()
} // class CounterTests
