package com.tradelink.customers.api.rest.v1.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.tradelink.customers.lib.v1.Customer;

@Path("/customers")
@ApplicationScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @GET
    public Response getCustomers(@QueryParam("limit") Integer limit,
                                 @QueryParam("offset") Integer offset) {

        return Response.ok("Hello").build();
    }

    @POST
    public Response createCustomer(Customer newCustomer) {
        return null;
    }

    @GET
    @Path("/{id}")
    public Response findCustomerById(@PathParam("id") String id) {
        return null;
    }


}
