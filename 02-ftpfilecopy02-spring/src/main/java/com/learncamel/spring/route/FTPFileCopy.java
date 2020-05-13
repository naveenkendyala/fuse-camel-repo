package com.learncamel.spring.route;

import org.apache.camel.builder.RouteBuilder;

public class FTPFileCopy extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        from("ftp://speedtest.tele2.net?include=1KB.*zip")              //Consumer Information
        .routeId("route-ftpfilecopy")                                   //Establish a name to the Route
        .to("file://src/data/outgoing?fileExist=Fail");                 //Producer. Create an Error when the file is already present


    }
}