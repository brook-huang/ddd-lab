package org.sample.interfaces.hotel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * @author <a href="mailto:018471@expedia.com">018471</a>
 */
@Path("/hotel/rest")
public class HotelRestService
{
	@GET
	@Path("search")
	@Produces({"application/xml", "application/json"})
	public Object search(@Context UriInfo ui)
	{
		return null;
	}
}