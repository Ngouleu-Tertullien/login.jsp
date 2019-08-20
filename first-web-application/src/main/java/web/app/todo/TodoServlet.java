package web.app.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.app.todo.Todoservice;


@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {

	private Todoservice userValidationService = new Todoservice();
	private Todoservice todoService = new Todoservice();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("todos",todoService.retreiveTodos());
		request.getRequestDispatcher("/WEB-INF/todo.jsp").forward(request, response);
	}

}