package com.learncamel.spring.route;

import org.apache.camel.builder.RouteBuilder;

public class MsgActiveMQ extends RouteBuilder{

    @Override
    public void configure() throws Exception {

      from("timer://myTimer?fixedRate=true&period=5000")
      .routeId("route-msgactivemq")                                   //Establish a name to the Route
      .transform().constant("Hello World")
      .to("activemq:queue:helloworldqueue");

    }
}