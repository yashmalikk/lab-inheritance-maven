package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter {

  // Attributes
  int bound;

  // Constructor
  public BoundedCounter(int start, int upperbound){
    super(start);
    this.bound = upperbound;
  }

  // Method(s)
  @Override
  public void increment() throws Exception {
  if (this.count < this.bound) {
    this.count++; // Increment the count if it's below the bound
  } else {
    throw new Exception("Count has reached its bound."); // Throw exception if bound is reached
    }
  } // increment()
}
