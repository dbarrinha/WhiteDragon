package br.com.timemanager.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public abstract class AppController {

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getFlash().setKeepMessages(true);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
}
