package com.learn.spring.camel.ftp;

import org.apache.camel.builder.RouteBuilder;

public class FTPFileCopy extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        from("ftp://speedtest.tele2.net?include=1KB.*zip")
        .routeId("route-ftpfilecopy")
        .to("file://src/data/ftp");

    }

}