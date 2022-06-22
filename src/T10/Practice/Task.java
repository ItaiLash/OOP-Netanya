package T10.Practice;

public class Task implements Comparable<Task>{
	private String name;
	private String description;
	public int priority;
	
	public Task(String name, String description, int priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	@Override
	public int compareTo(Task o) {
		return priority - o.priority;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if(this.getClass() != obj.getClass())
			return false;
		
		Task task = (Task)obj;
		if(name.equals(task.name))
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", description=" + description + ", priority=" + priority + "]";
	}
}
