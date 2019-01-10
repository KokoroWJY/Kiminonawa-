import java.util.Scanner;

public class ClassZhangTen {
    public static boolean[] findPrime(int n) {
        boolean[] list = new boolean[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = true;
            for (int a = 2; a <= i; a++) {
                if ((i + 1) % a == 0) {
                    list[i] = false;
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个数 : ");
        int n = in.nextInt();
        System.out.println("比您输入的数小的质数有");
        boolean[] prime = findPrime(n);
        int a = 0;
        for (int i = 1; i < prime.length; i++) {
            if (prime[i]) {
                System.out.printf("%5d", (i +1));
                a++;
                if (a % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
