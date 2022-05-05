package com.training.resource;

import java.util.List;

import com.training.model.Product;
import com.training.model.Student;
import com.training.service.ProductService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/products")

public class ProductResource {

	
	private static ProductService service = new ProductService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product>findAll(){
		return service.findAll();
		
	}
	
		
	@GET
	@Path("/srch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id")int id) {
		try {
			Product entity=service.findById(id).orElseThrow(()->new RuntimeException("Id not found"));
			return Response.ok(entity).build();
			}catch(RuntimeException e) {
			e.printStackTrace();
		return Response.ok("Id not found").status(400,"id not found").build();
	}
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addProduct(Product product) {
		
	 int result = service.addProduct(product);
			if(result!=0) {
				return Response.ok(product).status(201).build();
			}else {
				return Response.status(400,"Not Ceated").build();
			}
			
		}
	@DELETE
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteById(@PathParam("productId")int id) {
		int result=service.deleteById(id);
		if(result!=0){
			return Response.ok("One resource is deleted ").status(204).build();
		}
		else {
			return Response.status(400,"not deleted").build();
		}
	}
	@PUT
	@Path("/{productName}/{newPrice}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateById(@PathParam("productName")  String productName , @PathParam("newPrice") double newPrice)
	{
		int result=service.update(productName, newPrice);
		return Response.ok("updated"+result+"rows").build();

	}

	
	}
	
