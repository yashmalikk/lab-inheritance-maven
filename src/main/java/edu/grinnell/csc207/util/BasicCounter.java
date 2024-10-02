package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
  //Attributes
  int count;
  int start;

  //Constructor
  public BasicCounter (int value) {
    this.count = value;
    this.start = value;
  }

  //Methods
  public void increment() {
    this.count+=1;
  }

  public void reset() {
    this.count = this.start;
  }

  public String toString() {
    return ("[" + this.count + "]");
  }

  public int get() {
    return this.count;
  }
}
