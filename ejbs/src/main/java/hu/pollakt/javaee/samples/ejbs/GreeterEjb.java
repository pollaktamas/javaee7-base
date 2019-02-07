package hu.pollakt.javaee.samples.ejbs;

import javax.ejb.Stateless;

@Stateless
public class GreeterEjb {

    public String getGreetingMessage() {
        return "Hello From GreeterEjb EJB!";
    }
}
