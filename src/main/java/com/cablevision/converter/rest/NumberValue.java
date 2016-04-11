package com.cablevision.converter.rest;

import javax.validation.constraints.NotNull;

public class NumberValue {

  @NotNull
  private NumberBase base;

  @NotNull
  private Long val;

  public NumberBase getBase() {
    return base;
  }

  public void setBase(NumberBase base) {
    this.base = base;
  }

  public Long getVal() {
    return val;
  }

  public void setVal(Long val) {
    this.val = val;
  }
}
