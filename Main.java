import book;
public class Main {
    public static void main(String[] args) {
        book book = new book();
        book.addNew("89156455533", "Igor");
        book.addNew("89126425533", "Denis");
        book.addNew("89176452533", "Alexei");
        book.addNew("89166455233", "Vladimir");
        book.addNew("89116455233", "Fedor");
        System.out.println(book.getAll());
        System.out.println("---------------------------");
        System.out.println(book.getbyNumber("89166455233"));
        System.out.println("---------------------------");
        System.out.println(book.getByName("Denis"));

    }
}