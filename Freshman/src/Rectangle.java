public class Rectangle {
    int width;
    int height;
    Point origin;

    Rectangle(int width, int height, Point origin) {
        this.width = width;
        this.height = height;
        this.origin = origin;
    }

    void move(int x, int y) {

    }

    int getArea() {
        return width * height;
    }
}
