package less_30;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Yegor", "Bugaenko");
        Book book1 = new Book(author, "Elegant Objects", 2024);

        Author author2 = new Author(author.getName(), author.getSurname());
        Book book2 = new Book(author2, "Code ahead", 2017);

        System.out.println(book1);
        System.out.println("-------------------------");
        System.out.println(book2);
        System.out.println("-------------------------");

        book1.setNameOfBook("Ugly Objects");
        book1.setYearOfWrite(2030);
        author2.setName("Gleb");
        author2.setSurname("Fert");
        book2.setAuthor(author2);

        System.out.println(book1);
        System.out.println("-------------------------");
        System.out.println(book2);
    }
}
