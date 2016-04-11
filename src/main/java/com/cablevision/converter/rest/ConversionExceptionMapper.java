package com.cablevision.converter.rest;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ConversionExceptionMapper implements ExceptionMapper<ConversionException> {

  @Override
  public Response toResponse(final ConversionException exception) {
    return toResponseBuilder(exception).build();
  }

  private ResponseBuilder toResponseBuilder(final ConversionException exception) {
    return Response
        .status(Status.BAD_REQUEST)
        .entity(exception.toString())
        .type(MediaType.APPLICATION_JSON);
  }
}
