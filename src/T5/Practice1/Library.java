package T5.Practice1;

public class Library {
	private String[] books;
	private Subscribable[] subscribers;

	public Library(String[] books, Subscribable[] subscribers) {
		this.books = books;
		this.subscribers = subscribers;
	}

	public boolean borrowBook(Subscribable sub, String bookName) {
		if (subscriberExist(sub) && bookExist(bookName))
			return sub.borrowBook(bookName);

		return false;
	}

	public boolean returnBook(Subscribable sub, String bookName) {
		if (subscriberExist(sub) && bookExist(bookName))
			return sub.returnBook(bookName);

		return false;

	}

	private boolean subscriberExist(Subscribable sub) {
		for (Subscribable somebody : subscribers)
			if (sub.equals(somebody))
				return true;
		return false;
	}

	private boolean bookExist(String bookName) {
		for (String book : books)
			if (book.equals(bookName))
				return true;
		return false;
	}
}
