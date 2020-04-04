public class Column implements Comparable { // Comparable 接口
    private double radius; // 半径
    private double h; // 高

    Column(double radius, double h) {
        this.radius = radius;
        this.h = h;
    }

    public String toString() {
        return "(" + this.radius + ", " + this.h + ")";
    }

    @Override
    public int compareTo(Object o) {
        Column a = (Column) o;
        if (this.radius != a.radius) {
            if (this.radius - a.radius > 0) {
                return 1; // 正序
            } else {
                return -1; // 倒序
            }
        } else {
            if (this.h - a.h > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
