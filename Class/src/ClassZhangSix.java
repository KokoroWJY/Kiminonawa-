public class ClassZhangSix {
    private static int[] a;

    public static void main(String[] args) {
        a = new int[42];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * 81) + 20);
            printScores(i);
        }
        printAvg();
        printMax();
        printMin();
    }

    public static void printScores(int i) {
        if ((i + 1) % 7 != 0) {
            System.out.print(a[i] + "\t");
        } else {
            System.out.println(a[i]);
        }
    }

    public static void printAvg() {
        int b = 0;// 所有人的分数和
        for (int f = 0; f < a.length; f++) {
            b += a[f];
        }
        int c = b / 42;//平均分
        System.out.println("本科成绩平均分为 :" + c);
        int d = 0;//高于平均分的人数
        for (int g = 0; g < a.length; g++) {
            if (a[g] > c) {
                d++;
            }
        }
        System.out.println("高于平均分的学生人数: " + d);
    }

    public static void printMax() {
        int b = 0;
        int d = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1] && b < a[i + 1]) {
                b = a[i + 1];
            } else if (a[i] > a[i + 1] && b < a[i]) {
                b = a[i];
            }
        }
        for (int e = 0; e < a.length; e++) {
            if (a[e] == b) {
                d = e;
                break;
            }
        }
        System.out.println("课程最高分 :" + b + "\t第一个最高分的学生序号是 :" + d);
    }

    public static void printMin() {
        int b = 1000;
        int d = 1000;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1] && b > a[i + 1]) {
                b = a[i + 1];
            } else if (a[i] < a[i + 1] && b > a[i]) {
                b = a[i];
            }
        }
        for (int e = 0; e < a.length; e++) {
            if (a[e] == b) {
                d = e;
                break;
            }
        }
        System.out.println("课程最低分 :" + b + "\t第一个最低分的学生序号是 :" + d);
    }
}
