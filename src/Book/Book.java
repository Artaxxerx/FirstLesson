package Book;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book [Название=" + title + ", Автор=" + author + ", год=" + year + "]";
    }

    public void printInfo(Book book) {
        System.out.println(book.toString());
    }

    public static void main(String[] args) {

        Book book1 = new Book("Book 1", "author1", 2021);
        Book book2 = new Book("Book 2", "author2", 2022);
        Book book3 = new Book("Book 3", "author3", 2023);

        Book[] books = {book1, book2, book3};

        for (int i = 0; i < books.length; i++) {
            books[i].printInfo(books[i]);
        }
    }
}