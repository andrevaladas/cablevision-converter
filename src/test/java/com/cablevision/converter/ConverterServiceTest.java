package com.cablevision.converter;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cablevision.converter.ConverterApplication;
import com.cablevision.converter.service.ConversionService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConverterApplication.class)
public class ConverterServiceTest {

  private static final int HEX_RADIX = 16;

  @Inject
  private ConversionService conversionService;

  @Test
  public void testNumberRange() throws Exception {

    long range = 10000;

    for (long number = -range; number <= range; number++) {
      testNumberConversion(number);
    }
  }

  @Test
  public void testMinIntegerValue() throws Exception {
    testNumberConversion(Integer.MIN_VALUE);
  }

  @Test
  public void testMaxIntegerValue() throws Exception {
    testNumberConversion(Integer.MAX_VALUE);
  }

  @Test
  public void testMinLongValue() throws Exception {
    testNumberConversion(Long.MIN_VALUE + 1);
  }

  @Test
  public void testMaxLongValue() throws Exception {
    testNumberConversion(Long.MAX_VALUE);
  }

  private void testNumberConversion(long number) {
    String convertedValue = conversionService.decimalToHex(number);
    Assert.assertNotNull(convertedValue);
    Assert.assertEquals(Long.toString(number, HEX_RADIX).toUpperCase(), convertedValue.toUpperCase());
  }
}
