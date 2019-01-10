import java.util.Scanner;

public class ClassZhangSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个十六进制的数 : ");
        String str = in.next();
        int x = Integer.parseInt(str, 16);
        // 可以将radix进制的数转化为十进制的数
        System.out.println(str + "的十进制数是 : " + x);
    }
}
