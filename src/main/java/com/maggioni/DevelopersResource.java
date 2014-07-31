package com.maggioni;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author maggioni
 */
@Path("developers")
public class DevelopersResource {
 
    @GET
    public String developers() {
        return "duke,angelo";
    }
    
    @GET
    @Path("{first}-{last}")
    @Produces(MediaType.APPLICATION_XML)
    public Developer developer(@PathParam("first") String first, @PathParam("last") String last) {
        return new Developer(first, last);
    }
}
