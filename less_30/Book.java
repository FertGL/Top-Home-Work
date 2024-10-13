package less_30;

public class Book {
    private Author author;
    private String nameOfBook;
    private Integer yearOfWrite;

    public Book() {
    }

    public Book(Author author, String nameOfBook, Integer yearOfWrite) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.yearOfWrite = yearOfWrite;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public Integer getYearOfWrite() {
        return yearOfWrite;
    }

    public void setYearOfWrite(Integer yearOfWrite) {
        this.yearOfWrite = yearOfWrite;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Об авторе: \n" + author + "\n" +
                "Название книги: " + nameOfBook + "\n" +
                "Год написания: " + yearOfWrite;
    }
}
