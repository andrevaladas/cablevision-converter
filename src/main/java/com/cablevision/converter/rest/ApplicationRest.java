package com.cablevision.converter.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Path("/")
@Produces({MediaType.APPLICATION_JSON})
public class ApplicationRest {

  @Value("${spring.application.name}")
  private String name;

  @Value("${spring.application.version}")
  private String version;

  @GET
  public String getNameANdVersion() {
    return String.format("%s-%s", name, version);
  }
}
