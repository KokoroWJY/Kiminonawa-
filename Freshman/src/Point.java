public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        System.out.println("x: " + p1.x + "\ny: " + p1.y);
        Point p2 = new Point(5, -1);
        System.out.println("x: " + p2.x + "\ny: " + p2.y);
        p2.move(0, 0);
    }

}
