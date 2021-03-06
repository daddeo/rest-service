package com.sample.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/unique-email-address-check")
@Consumes({MediaType.APPLICATION_JSON})
public class EmailAddressCheckResource {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public int uniquenessCheck(Addresses addresses) {
		String[] list = addresses.getList();
		System.out.println("Input email addresses:");
	    for (int idx = 0; idx < list.length; idx++){
			System.out.println(list[idx]);
	    }
		int count = addresses.getUniqueCount();
		System.out.println("Unique count:" + count);
		return count;
	}

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		System.out.println("test called...");
		return "ok";
	}
}
