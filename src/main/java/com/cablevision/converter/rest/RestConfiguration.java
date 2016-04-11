package com.cablevision.converter.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/")
public class RestConfiguration extends ResourceConfig {

  public RestConfiguration() {
    register(ConversionExceptionMapper.class);
    register(ApplicationRest.class);
    register(ConverterRest.class);
  }
}
