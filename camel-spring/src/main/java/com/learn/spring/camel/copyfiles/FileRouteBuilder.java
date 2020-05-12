package com.learn.spring.camel.copyfiles;

import org.apache.camel.builder.RouteBuilder;

public class FileRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        //Hover over the attributes for more details on documentation
        from("file://src/data/copyfiles/incoming?include=message.*xml")
        .routeId("route-copyfiles")
        .to("file://src/data/copyfiles/outgoing?fileExist=Override");

        //Similar route like above but will result into an error
        /*
        from("file://src/data/copyfiles/incoming?include=message.*xml")
        .routeId("route-copyfiles")
        .to("file://src/data/copyfiles/outgoing?fileExist=Fail");
        */

        
    }
}