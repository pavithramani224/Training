package com.training;

	import jakarta.ws.rs.GET;
	import jakarta.ws.rs.Path;
	import jakarta.ws.rs.Produces;
	import jakarta.ws.rs.core.MediaType;

	@Path("myresource")
	public class MyResources {

			
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String getMessage() {
				
			return "Hi pavi";
		}
	}
