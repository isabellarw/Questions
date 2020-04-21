
public class Book {
	String title;
	String author;
	int pubYear;
	
	public Book(String t, String a, int p) {
		title = t;
		author = a;
		pubYear = p;
	}
	
	public String toString() {
		return title + ", written by " + author + ", was published in " + pubYear + ".";
	}
}
