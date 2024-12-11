package less_60;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    Map<Integer, Book> books = new HashMap<>();

    public Map<Integer, Book> addBook(Book book) {
        books.put(book.getId(), book);
        return books;
    }

    public List<Book> getSortedBooks(boolean isAvailable,Comparator<Book> comparator) {
        return books.entrySet()
                .stream()
                .map(b -> b.getValue())
                .filter(b -> b.isAvailable() == isAvailable)
                .sorted(comparator)
                .toList();
    }

    public int getBooksCount() {
        System.out.println("В библиотеке числится книг: " + books.size());
        return books.size();
    }

    public int getBooksCount(boolean isAvailable) {
        List<Map.Entry<Integer, Book>> availableBooks = books.entrySet()
                .stream()
                .filter(b -> b.getValue().isAvailable() == isAvailable)
                .toList();

        if (isAvailable) {
            System.out.println("В библиотеке книг: " + availableBooks.size());
        } else {
            System.out.println("В библиотеке нет в наличии книг: " + availableBooks.size());
        }
        return availableBooks.size();
    }

    public Book getBook(int id) {
        return books.get(id);
    }

    public  List<Book> getSortedBooks(Comparator<Book> comparator) {
        return books.entrySet()
                .stream()
                .map(t -> t.getValue())
                .sorted(comparator)
                .toList();
    }

    public Set<String> getAllAuthors() {
        Set<String> allAuthors = books.entrySet()
                .stream()
                .map(a -> a.getValue().getAuthor())
                .sorted(String::compareTo)
                .distinct()
                .collect(Collectors.toCollection(() -> new LinkedHashSet<>()));
        return allAuthors;
    }
}

