public class CartTest {
    public static void main(String[] args) {
        ShoppingCar myCart = new ShoppingCar("weijuny");
        CarItem c1 = new CarItem("001", "洗发水", 20, 1);
        CarItem c2 = new CarItem("001", "洗发水", 20, 2);
        CarItem c3 = new CarItem("002", "牙膏", 10, 1);
        CarItem c4 = new CarItem("003", "酸奶", 5, 2);
        myCart.addItem(c1);
        myCart.addItem(c2);
        myCart.addItem(c3);
        myCart.addItem(c4);
        System.out.println(myCart.toString());
        myCart.setQuantity(1, 2);
        System.out.println(myCart.toString());
        myCart.removeItem(1);
        System.out.println(myCart.toString());
        myCart.clearCart();
        System.out.println(myCart.toString());
    }
}