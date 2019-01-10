import java.util.Scanner;

public class ClassZhangTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入正确答案:");
        String a = in.next();
        System.out.print("请输入考生答案:");
        String b = in.next();
        int c;
        int d = 0;
        c = b.length();
        for (int i = 0; i < c; i++) {
            if (a.length() == 1) {
                if (b.charAt(i) == a.charAt(0)) {
                    d++;
                } else {
                    System.out.println("不合格");
                    d = 0;
                }
            } else if (a.length() == 2) {
                if (b.charAt(i) == a.charAt(0)) {
                    d++;
                } else if (b.charAt(i) == a.charAt(1)) {
                    d++;
                } else {
                    System.out.println("不合格");
                    d = 0;
                }
            } else if (a.length() == 3) {
                if (b.charAt(i) == a.charAt(0)) {
                    d++;
                } else if (b.charAt(i) == a.charAt(1)) {
                    d++;
                } else if (b.charAt(i) == a.charAt(2)) {
                    d++;
                } else {
                    System.out.println("不合格");
                    d = 0;
                }
            } else if (a.length() == 4) {
                if (b.charAt(i) == a.charAt(0)) {
                    d++;
                } else if (b.charAt(i) == a.charAt(1)) {
                    d++;
                } else if (b.charAt(i) == a.charAt(2)) {
                    d++;
                } else if (b.charAt(i) == a.charAt(3)) {
                    d++;
                } else {
                    System.out.println("不合格");
                    d = 0;
                }
            }
        }
        if (d == a.length()) {
            System.out.println("得分5分");
        } else if (d < a.length() && d != 0) {
            System.out.println("2分");
        }
    }
}
