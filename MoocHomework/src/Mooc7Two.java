import java.util.Scanner;

public class Mooc7Two {
    private static int c; // 输入的2个数中 小的那个
    private static int d; // 输入的2个数中 大的那个

    public static void Prime() {
        if (c == 1 || c == 2) {
            c = 3;
        } else if (d < 3) {
            System.out.println(" ");
        }
    }

    public static void Complete() {
        //判断数是否为完数
        int f = 0; // 判断是否 有 完数
        int e = 0; // 判断是否 是 完数
        StringBuilder str = new StringBuilder();
        // StringBuilder 可以让字符串相加
        for (int i = 1; c <= d; i++) {
            if (c % i == 0) {
                e += i;
            }
            if (e == c) {
                str = str.append(e + " ");
                c++;
                i = 0;
                e = 0;
                f++;
            } else if (i == c - 1) {
                c++;
                i = 0;
                e = 0;
            }
        }
        if (f != 0) {
            System.out.println(str.substring(0, str.length() - 1));
        } else {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            c = b;
            d = a;
        } else {
            c = a;
            d = b;
        }
        Prime();
        Complete();
    }
}
