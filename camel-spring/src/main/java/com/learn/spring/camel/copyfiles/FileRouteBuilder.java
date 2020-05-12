package com.learn.spring.camel.copyfiles;

import org.apache.camel.builder.RouteBuilder;

public class FileRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("file://src/data/copyfiles/incoming?noop=true&include=message.*xml")
        .routeId("route-copyfiles")
        .to("file://src/data/copyfiles/outgoing?fileExist=Override");

        
        
    }
}