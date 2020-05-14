package com.learncamel.spring.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class MsgTimer extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        //Start the route with the periodic timer
        from("timer:msgtimer?fixedRate=true&period=1000")
        .log(LoggingLevel.INFO, "Hello World !");
    }
    
}