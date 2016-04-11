package com.cablevision.converter.service;

import org.springframework.stereotype.Component;

@Component
public class ConversionServiceImpl implements ConversionService {

  private static final char[] hexChars =
      {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

  /*
   * (non-Javadoc)
   * 
   * @see com.cablevision.converter.conversion.ConverterService#decimalToHex(long)
   */
  @Override
  public String decimalToHex(long number) {

    StringBuilder hex = new StringBuilder(17);

    boolean negative = number < 0;
    long value = negative ? -number : number;

    do {
      //10101010 => 00001010 & 00001111
      char ch = hexChars[(int) (value & 0xF)];
      //1011110000 => 0000101111
      value >>= 4;
      hex.append(ch);
    } while (value > 0);

    if (negative) {
      hex.append('-');
    }
    return hex.reverse().toString();
  }
}
