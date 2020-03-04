public class Car {
    String name;
    int price;
    int speed;
    Car(String name, int price, int speed){
        this.name = name;
        this.price = price;
        this.speed = speed;
    }
    void speedUp(int s){
        speed = s;
    }
    void stop(){
        speed = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed(){
        return speed;
    }

    public static void main(String[] args){
        Car c = new Car("宝马", 200, 60);
        c.speedUp(100);
        System.out.println(c.speed);
        c.stop();
    }
}
