package br.com.timemanager.service;

import javax.ws.rs.Path;

@Path("/timeservice")
public class ServiceTimeManager {
	
	
	
	public String startSignature(@PathParam("docId") String docId) throws RestException{
		
		Long accountabilityItemId = Long.parseLong(docId);
		
		String token = assinaturaDigitalService.calcularHash(accountabilityItemFacade.getFileContent(accountabilityItemId));
		
		return "\"" + token + "\"";
	}
}
