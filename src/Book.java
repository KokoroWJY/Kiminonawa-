public class Book {
    String bookName;
    String author;
    double price;

    Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    void setBookName(String bookName) {
        this.bookName = bookName;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return this.bookName;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "书名: " + bookName + "\t作者: " + author + "\t价格: " + price;
    }
}
