package com.learncamel.spring.route;

import org.apache.camel.builder.RouteBuilder;

public class MsgActiveMQ extends RouteBuilder{

    @Override
    public void configure() throws Exception {

      from("timer://myTimer?fixedRate=true&period=5000")              //Timer process that kicks off every 5 seconds
      .routeId("route-msgactivemq")                                   //Establish a name to the Route
      .transform().constant("Hello World")
      .to("activemq:queue:sample.queue");                             //Send the message to the Queue

    }
}