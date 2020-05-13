package com.learncamel.spring.route;

import org.apache.camel.builder.RouteBuilder;

public class FileRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        //Hover over the attributes for more details on documentation
        from("file://src/data/incoming?noop=true&include=message.*xml")
        .routeId("route-copyfiles")
        .to("file://src/data/outgoing?fileExist=Override");

    }
}