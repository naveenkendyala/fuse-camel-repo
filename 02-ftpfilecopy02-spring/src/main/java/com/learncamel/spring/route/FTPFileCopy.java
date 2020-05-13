package com.learncamel.spring.route;

import org.apache.camel.builder.RouteBuilder;

public class FTPFileCopy extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        onException(ValidationException.class)
        .handled(true);


        //Consumer Information
        from("ftp://speedtest.tele2.net?include=1KB.*zip")

        //Establish a name to the Route
        .routeId("route-ftpfilecopy")
                
        //Producer
        // Create an Error when the file is already present
        .to("file://src/data/outgoing?fileExist=Fail");

        //Add Exception Handling        

    }
}