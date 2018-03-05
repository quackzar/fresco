package dk.alexandra.fresco.decimal.fixed;

import dk.alexandra.fresco.decimal.SReal;
import dk.alexandra.fresco.framework.DRes;
import dk.alexandra.fresco.framework.value.SInt;

/**
 * Closed datatype for representing binary fixed point numbers, e.g. represent a fraction <i>x</i>
 * as <i>m 2<sup>n</sup></i> where <i>m</i> is an {@link SInt}, <i>n &ge; 0</i> is a precision
 * (avaialble via {@link #getPrecision()}) that may vary from value to value.
 */
public class SFixed implements SReal, DRes<SReal> {
  private final DRes<SInt> value;
  private final int precision;

  public SFixed(DRes<SInt> value, int precision) {
    this.value = value;
    this.precision = precision;
  }

  DRes<SInt> getSInt() {
    return value;
  }

  int getPrecision() {
    return precision;
  }

  @Override
  public SFixed out() {
    return this;
  }
}
