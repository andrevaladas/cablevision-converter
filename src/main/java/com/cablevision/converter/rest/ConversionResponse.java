package com.cablevision.converter.rest;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConversionResponse {

  @NotNull
  private NumberResponse number;

  public ConversionResponse(NumberResponse number) {
    this.number = number;
  }

  public NumberResponse getNumber() {
    return number;
  }

  public void setNumber(NumberResponse number) {
    this.number = number;
  }
}
