package br.com.timemanager.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/webServer", name="ServletTimeManager")
public class ServiceTimeManager extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String id_card = request.getParameter("idcard");
		System.out.println("String enviada via get: " + id + "card: "+ id_card);
	}
}
