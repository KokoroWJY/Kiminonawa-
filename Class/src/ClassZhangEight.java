import java.util.Scanner;

public class ClassZhangEight {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入7个[1,32]范围内的数 : ");
        int[] a = new int[7];
        for (int i = 0; i < 7; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[7];
        System.out.print("开奖号码是 : ");
        for (int i = 0; i < 7; i++){
            b[i] = (int)(Math.random() * 32) + 1;
            if (i != 6) {
                System.out.print(b[i] + "\t");
            }else {
                System.out.println(b[i]);
            }
        }
        int d = 0;
        for (int i = 0; i < 7; i++){
            for (int c = 0; c < 7; c++){
                if (a[i] == b[c]){
                    d++;
                }
            }
        }
        System.out.println("您中了" + d + "个号!");
    }
}
