package edu.sjsu.cmpe282.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.sjsu.cmpe282.domain.*;
import edu.sjsu.cmpe282.dto.*;

@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {
	
	private ProductDao productdao = new ProductDao();
	
	@POST
	@Path("/productlist")
	public Product[] listProducts() throws ClassNotFoundException {
		
		//System.out.print("user created: "+user.getFirstName());
		return productdao.getProductList();
		//return user;//Response.status(201).entity("User Created : \n"+ user.getFirstName()).build();
	}

	@POST
	@Path("/productpreview")
	public ProductInfo getproduct(Product prod)
	{
		return productdao.getProductDetails(prod);
	}

}
