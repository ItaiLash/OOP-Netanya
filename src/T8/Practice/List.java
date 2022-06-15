package T8.Practice;

import java.util.NoSuchElementException;

public class List<T> {
	private ListItem<T> head;

	public List() {
		head = null;
	}

	public void addItem(T info) {
		head = new ListItem<T>(info, head);
	}

	public T firstElm() {
		return head.getInfo();
	}

	public void clear() {
		head = null;
	}

	public int size() {
		int size = 0;
		ListItem<T> current = head;

		while (current != null) {
			size++;
			current = current.getNext();
		}

		return size;
	}

	public boolean contains(T t) {
		ListItem<T> current = head;

		while (current != null) {
			if (current.getInfo().equals(t))
				return true;

			current = current.getNext();
		}

		return false;
	}

	public void addLast(T t) {
		ListItem<T> item = new ListItem<T>(t, null);

		if (head == null) {
			head = item;

			return;
		}

		ListItem<T> current = head;

		while (current.getNext() != null)
			current = current.getNext();

		current.setNext(item);
	}

	public Object[] toArray() {
		Object[] array = new Object[size()];
		ListItem<T> current = head;
		int i = 0;

		while (current != null) {
			array[i++] = current.getInfo();
			current = current.getNext();
		}

		return array;
	}

	public T get(int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException(index + "");

		ListItem<T> current = head;

		for (int i = 0; i < index; i++)
			current = current.getNext();

		return current.getInfo();
	}

	public T getLast() {
		if (head == null)
			throw new NoSuchElementException();

		ListItem<T> current = head;

		while (current.getNext() != null)
			current = current.getNext();

		return current.getInfo();

	}

	public int indexOf(T t) {
		ListItem<T> current = head;
		int index = 0;

		while (current != null) {
			if (current.getInfo().equals(t))
				return index;

			current = current.getNext();
			index++;

		}

		return -1;
	}



	public boolean remove(T t) {
		ListItem<T> current = head;
		ListItem<T> before = null;

		while (current != null) {
			if (current.getInfo().equals(t)) {
				remove(before, current);
				return true;
			}

			before = current;
			current = current.getNext();

		}

		return false;
	}

	private void remove(ListItem<T> before, ListItem<T> current) {
		if (before == null) { // Current is the first item
			head = current.getNext();
		} else {
			before.setNext(current.getNext());
		}
	}
}
