package question2;

public class Book {
	 private String name;
	    @Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", pages=" + pages + ", cost=" + cost + ", bookNumber="
				+ bookNumber + "]";
	}

		private Author author;
	    private int pages;
	    private double cost;
	    private int bookNumber;

	    public Book(String name, Author author, int pages, double cost, int bookNumber) {
	        this.name = name;
	        this.author = author;
	        this.pages = pages;
	        this.cost = cost;
	        this.bookNumber = bookNumber;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public Author getAuthor() {
	        return this.author;
	    }

	    public int getPages() {
	        return this.pages;
	    }

	    public double getCost() {
	        return this.cost;
	    }

	    public int getBookNumber() {
	        return this.bookNumber;
	    }
}
