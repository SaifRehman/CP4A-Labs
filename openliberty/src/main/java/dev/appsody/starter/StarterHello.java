package dev.appsody.starter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/hello")
public class StarterHello {

    @GET
    public String getRequestHello() {
        return "Hello World";
    }
}
