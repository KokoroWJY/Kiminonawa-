public class Car {
    String name;
    int price;
    int speed;

    Car(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    void speedUp(int s) {
        speed = s;
    }

    void stop() {
        speed = 0;
    }

    public static void main(String[] args) {
        Car c = new Car("宝马", 200, 60);
        c.speedUp(100);
        System.out.println(c.speed);
        c.stop();
    }
}
