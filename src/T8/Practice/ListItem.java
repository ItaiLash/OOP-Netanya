package T8.Practice;

public class ListItem<T> {
	private ListItem<T> next;
	private T info;

	public ListItem(T info, ListItem next) {
		this.info = info;
		this.next = next;
	}

	public ListItem<T> getNext() {
		return next;
	}

	public void setNext(ListItem<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
}
