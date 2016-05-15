/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restful;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

import entity.ObjectWitchShow;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Sergey
 */
@Path("restfulws")
public class RestfulwsResource {

    /**
     * Creates a new instance of RestfulwsResource
     */
    public RestfulwsResource() {
    }

    /**
     * Retrieves representation of an instance of restful.RestfulwsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getJson() {
//        throw new UnsupportedOperationException();
        ObjectWitchShow o = new ObjectWitchShow();
        o.setFirst("first");
        o.setSecond(0);
        System.out.println("" + o.toString());
        return Response.ok(o).build();
    }

    /**
     * PUT method for updating or creating an instance of RestfulwsResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
