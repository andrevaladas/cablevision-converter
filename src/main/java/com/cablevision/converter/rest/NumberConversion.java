package com.cablevision.converter.rest;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NumberConversion {

  @NotNull
  private NumberValue number;

  public NumberValue getNumber() {
    return number;
  }

  public void setNumber(NumberValue number) {
    this.number = number;
  }
}
