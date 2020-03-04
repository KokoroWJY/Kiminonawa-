public class CarItem {
    String id;
    String name;
    int price;
    int quantity; //数量

    CarItem(String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void setId(String id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        int num = price * quantity;
        return id + "\t" + name + "\t" + price + "\t" + quantity + "\t" + num;
    }
}
