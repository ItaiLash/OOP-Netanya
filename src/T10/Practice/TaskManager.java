package T10.Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskManager {
	private ArrayList<Task> tasks;

	public TaskManager() {
		tasks = new ArrayList<Task>();
	}
	
	public int size() {
		return tasks.size();
	}
	
	public void clear() {
		tasks.clear();
	}
	
	public void addTask(Task task) {
		int i = 0;
		// list still has elements and task priority > current priority 
		while(i < tasks.size() && task.compareTo(tasks.get(i)) > 0){
			i++;
			}
		tasks.add(i, task);
	}
	
	public void remove(Task task) {
		tasks.remove(task);
	}
	
	public boolean contains(Task task) {
		return tasks.contains(task);
	}

	@Override
	public String toString() {
		Iterator<Task> iterator = tasks.iterator();
		String s = "";
		
		while(iterator.hasNext()) {
			s = s + iterator.next().toString() + " ";
		}
		
		return s;
	}
	
	public void addTask4Reoven(Task task) {
		tasks.add(task);
		Collections.sort(tasks);
	}
	
	
	
}
