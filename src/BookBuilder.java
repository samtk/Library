
public class BookBuilder {

	private String author;
	private String publisher;
	private String datepublished;
	
	public Book buildBook() {
		return new Book(author, publisher, datepublished);
	}
	
	public BookBuilder author(String author) {
		this.author = author;
		return this;
	}
	
	public BookBuilder publisher(String publisher) {
		this.publisher = publisher;
		return this;
	}
	
	public BookBuilder datepublished(String datepublished) {
		this.datepublished = datepublished;
		return this;
	}
	
}
