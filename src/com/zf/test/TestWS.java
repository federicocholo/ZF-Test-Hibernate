package com.zf.test;

import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@WebService
@Path("/core")
public class TestWS {
	@Context HttpServletRequest request;
	ManageTestTable mtt = new ManageTestTable();
	
	@Path("/get/{key}")
	@GET
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public TestTable getTable(@PathParam("key") int key) {
		return mtt.getTestTable(key);
	}
	
	@Path("/save")
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public boolean setTable(TestTable table) {
		return mtt.saveOrUpdate(table);
	}

}
