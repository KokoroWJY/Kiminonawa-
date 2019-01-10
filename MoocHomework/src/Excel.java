import java.util.Scanner;

public class Excel {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        String str = Integer.toBinaryString(i);
        //Integer.toBinaryString() 可以将 十进制 的数转换为 二进制
        System.out.println(32 - str.length());
    }
}
