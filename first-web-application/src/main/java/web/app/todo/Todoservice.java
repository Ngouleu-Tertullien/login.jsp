package web.app.todo;

import java.util.List;
import java.util.ArrayList;

public class Todoservice {
	public static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Webdevelopment"));
		todos.add(new Todo("Learn rest Spring"));
		todos.add(new Todo("Learn spring"));
	}
	public List<Todo> retreiveTodos(){
		return todos;
	}

}
