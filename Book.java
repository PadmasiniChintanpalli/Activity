package bookapplication;

public class Book {
	
	private int bookID;
	private String bookName;
	private double bookPrice;
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(int bookID, String bookName, double bookPrice) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
	}
	
}
