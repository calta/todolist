package cal.todolist.model;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	
	private String name;
	private List<ToDo> toDos = new ArrayList<ToDo>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<ToDo> getToDos() {
		return toDos;
	}
	
	public void setToDos(List<ToDo> toDos) {
		this.toDos = toDos;
	}
	
}
