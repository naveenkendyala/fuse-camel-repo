package com.learn.spring.camel.ftp;

import org.apache.camel.builder.RouteBuilder;

public class FTPFileCopy extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        //Consumer Information
        from("ftp://speedtest.tele2.net?noop=true&include=1KB.*zip")

        //Establish a name to the Route
        .routeId("route-ftpfilecopy")
        
        //Dump the Exchange Log Information using the processor
        .process(new ExchangePrinter())
        
        //Producer
        .to("file://src/data/ftp");

    }
}