package com.github.mongo.labs.api;

import com.github.mongo.labs.model.Speaker;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api(value = "/geo", description = "Recherche géolocalisé")
@Path("/geo")
@Produces(MediaType.APPLICATION_JSON)
public class GeoService {


    @GET
    @Path("/{longitude}/{latitude}")
    @ApiOperation(
            value = "Retrouve les speakers proche du point [longitude, latitude]",
            notes = "Un <b>index géolocalisé</b> doit être présent sur la collection des speakers"

    )
    public Iterable<Speaker> near(@PathParam("longitude") long longitude, @PathParam("latitude") long latitude) {
        return null;
    }
}