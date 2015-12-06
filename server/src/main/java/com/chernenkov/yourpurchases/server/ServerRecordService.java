package com.chernenkov.yourpurchases.server;

import javax.ws.rs.*;



@Path("/records")
public class ServerRecordService {

    @GET
    @Path("/date")
    @Produces("application/json")
    public String getTextByDate(@QueryParam("date") String date) {
        return date;
    }

    @GET
    @Path("/double")
    @Produces("text/html")
    public String getDoubleString(@QueryParam("string") String string) {
        return string + string;
    }
}

