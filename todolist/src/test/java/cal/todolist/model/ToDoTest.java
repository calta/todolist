package cal.todolist.model;

import junit.framework.TestCase;

public class ToDoTest extends TestCase {

	public void testGetName() {
		ToDo todo = new ToDo();
		todo.setName("My todo");
		assertEquals("name wrong", "My todo", todo.getName());
	}

}
