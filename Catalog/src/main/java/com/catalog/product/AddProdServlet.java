package com.catalog.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-product.do")
public class AddProdServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String prodCat = request.getParameter("prodCat");
		String price = request.getParameter("price");
		String prodId = request.getParameter("prodId");
		
		ProductServices.addProduct(name,prodCat,Integer.parseInt(price), Integer.parseInt(prodId));
		response.sendRedirect("/add-product.do");	
	}

}
