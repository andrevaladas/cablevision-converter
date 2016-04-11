package com.cablevision.converter.rest;

import javax.validation.constraints.NotNull;

public class NumberResponse {

  @NotNull
  private NumberBase base;

  @NotNull
  private String val;

  public NumberResponse(NumberBase base, String val) {
    this.base = base;
    this.val = val;
  }

  public NumberBase getBase() {
    return base;
  }

  public void setBase(NumberBase base) {
    this.base = base;
  }

  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }
}
