package rest;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import rest.PNR.Status;

@Path("/pnr")
public class PnrService {

	@GET
	@Path("/status")
	public PNR getStatus(@QueryParam("pnrNo") int pnrNo,
		@Context HttpServletResponse response) {
		
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		
		PNR pnr = new PNR();
		pnr.setPnrNo(pnrNo);
		pnr.setTrainNo(1111);
		pnr.setDate("25-June-2019");
		pnr.setStatus(Status.RAC);
		
		return pnr;
	}
		
		}
