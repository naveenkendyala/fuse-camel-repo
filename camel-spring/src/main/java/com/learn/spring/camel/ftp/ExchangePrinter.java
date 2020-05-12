package com.learn.spring.camel.ftp;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExchangePrinter implements Processor {

    private static Logger log = LoggerFactory.getLogger(ExchangePrinter.class);

    @Override
    public void process(Exchange exchange) throws Exception {

        //Extract the body and the headers from the Exchange
        String body = exchange.getIn().getBody().toString();
        Map<String,Object> headers = exchange.getIn().getHeaders();

        //Log the Body of the message
        log.info("Body:"+body);
        
        //Log the Header properties
        for(String key: headers.keySet()){
            log.info("Key: " + key + " | Value: " + headers.get(key));
          }        
    }
}
