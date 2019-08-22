package com.catalog.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/delete-product.do")
public class DeleteProdServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		ProductServices.deleteProduct(new Product(request.getParameter("name")));
		response.sendRedirect("/Catalogue/delete-product.do");	
			
	}

}
