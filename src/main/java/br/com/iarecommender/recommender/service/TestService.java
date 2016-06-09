package br.com.iarecommender.recommender.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("test")
public class TestService {

	@GET
	public Response xablau() {
		return Response.ok("Xablau").build();
	}

}
