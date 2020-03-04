public class TestBook {
    public static void main(String[] args) {
        Book b = new Book("红手指", "东野圭吾", 40);
        b.setPrice(20);
        System.out.println(b.toString());
    }
}
