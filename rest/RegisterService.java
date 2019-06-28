package com.lti.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.lti.daoclass.RegisterDao;
import com.lti.entity2.Register;

@Path("/register")
public class RegisterService {

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	//public String process(String json)
	public String process(Register register) {
		//System.out.println(register);
		RegisterDao dao = new RegisterDao();
		dao.save(register);
		return "okay";
	}
}
