package com.cablevision.converter.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.cablevision.converter.service.ConversionService;

@Component
@Path("/converter")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class ConverterRest {

  private ConversionService conversionService;

  @Inject
  public ConverterRest(ConversionService conversionService) {
    this.conversionService = conversionService;
  }

  public ConversionService getConversionService() {
    return conversionService;
  }

  @POST
  public ConversionResponse convert(NumberConversion numberConversion) throws ConversionException {

    NumberValue number = numberConversion.getNumber();

    if (!NumberBase.dec.equals(number.getBase())) {
      throw new ConversionException("Number base comversion not supported");
    }

    String decimalToHex = conversionService.decimalToHex(number.getVal());

    return new ConversionResponse(new NumberResponse(NumberBase.hex, decimalToHex));
  }
}
