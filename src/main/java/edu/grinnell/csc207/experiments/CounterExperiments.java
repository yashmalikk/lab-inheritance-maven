package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.Counter;
import edu.grinnell.csc207.util.DecrementableCounter;
import edu.grinnell.csc207.util.DoubleCounter;
import edu.grinnell.csc207.util.NamedCounter;
import edu.grinnell.csc207.util.BasicCounter;
import edu.grinnell.csc207.util.Tally;

import java.io.PrintWriter;

/**
 * Some experiments as we explore our various Counter classes.
 */
public class CounterExperiments {
  /**
   * Run our experiments.
   *
   * @param args
   *   The command-line arguments. Ignored.
   */
  public static void main(String[] args) throws Exception {
    // Set up output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Set up some counters
    Counter alpha = new NamedCounter("alfa", 0);
    Counter beta = new DoubleCounter(123);
    DecrementableCounter gamma = new DecrementableCounter(-5);

    // Print original values
    pen.println("Original alpha = " + alpha);
    pen.println("Original beta = " + beta);
    pen.println("Original gamma = " + gamma);
  
    // Print incremented values
    alpha.increment();
    beta.increment();
    gamma.increment();
    pen.println("Updated alpha = " + alpha);
    pen.println("Updated beta = " + beta);
    pen.println("Updated gamma = " + gamma);

    gamma.reset();
    pen.println("After resetting gamma: " + gamma);
    gamma.decrement();
    pen.println("After decrementing gamma: " + gamma);
    // And we're done
    pen.close();
  } // main(String[])
}
