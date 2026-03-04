package lab2.Problem1b;

public class Test {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("Pesnya lda i plameni", "George martin", 2008, "978-0132350884", 464);
        LibraryItem item2 = new Book("Duna", "neznau", 2018, "978-0134685991", 416);

        System.out.println(item1);
        System.out.println(item2);
    }
}