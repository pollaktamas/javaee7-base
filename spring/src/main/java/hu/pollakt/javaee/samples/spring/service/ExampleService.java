package hu.pollakt.javaee.samples.spring.service;

import hu.pollakt.javaee.samples.ejbs.GreeterEjb;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class ExampleService {

    @Resource(lookup = "java:module/GreeterEjb")
    GreeterEjb greeterEjb;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Message from injected greeterEjb: " + greeterEjb.getGreetingMessage());
    }
}
