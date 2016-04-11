package com.cablevision.converter.rest;

public class ConversionException extends Exception {

  private static final long serialVersionUID = 1L;

  public ConversionException(String message, Throwable cause) {
    super(message, cause);
  }

  public ConversionException(String message) {
    super(message);
  }
}
