package lab2.Problem1b;

public class Book extends LibraryItem {
    private String isbn;
    private int pages;

    public Book(String title, String author, int publicationYear, String isbn, int pages) {
        super(title, author, publicationYear);
        this.isbn = isbn;
        this.pages = pages;
    }

    public String getItemType() {
        return "Book";
    }

    public String getIsbn() {
        return isbn;
    }
    public int getPages() {
        return pages;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public String toString() {
        return super.toString() + "isbn='" + isbn +"', pages="+ pages;
    }
}