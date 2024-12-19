package less_60;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(1,"Название","Автор",true);
        Book b2 = new Book(2,"Second title","Автор",false);
        Book b3 = new Book(3,"Third title","Второй автор",true);
        Book b4 = new Book(4,"Fourth title","Второй автор",false);
        Book b5 = new Book(5,"Fifth title","Третий автор",true);

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);

        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };

        Comparator<Book> bookIdComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o2.getId(), o1.getId());
            }
        };

        System.out.println(library.getBook(1));
        System.out.println(library.getSortedBooks(false,bookComparator));
        System.out.println(library.getSortedBooks(bookIdComparator));
        library.getBooksCount();
        library.getBooksCount(true);
        library.getAllAuthors();

        System.out.println("-----------------------------------------------");
        System.out.println(library.getMapsBook());
        System.out.println("-----------------------------------------------");
        System.out.println(library.getBooksByAuthor());
    }
}
