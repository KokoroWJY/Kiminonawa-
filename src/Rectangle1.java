package Text0x1;

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle text = new Rectangle(2, 2, new Point(3, 3));
        System.out.println(text.GetArea());
        text.move(0, 0);
        System.out.println(text.width + " " + text.height);
    }
}

class Rectangle {
    int width;
    int height;
    Point origin;

    Rectangle(int width, int height, Point origin) {
        this.width = width;
        this.height = height;
        this.origin = origin;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Point getOrigin() {
        return origin;
    }

    void move(int x, int y) {
        origin.x += x;
        origin.y += y;
    }

    int GetArea() {
        return width * height;
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
