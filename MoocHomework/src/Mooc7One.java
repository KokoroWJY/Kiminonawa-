import java.util.Scanner;

public class Mooc7One {
    /*
    每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，
    这几个素数就都叫做这个合数的质因数。
    比如，6可以被分解为2x3，而24可以被分解为2x2x2x3。
     */
    private static int i; // 静态变量

    public static void isPrime(int a) {
        for (; i % a == 0; ) {
            if (i / a == 1) {
                System.out.print(a);
            } else {
                System.out.print(a + "x");
            }
            i = i / a;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        System.out.print(i + "=");
        isPrime(2);
        isPrime(3);
        isPrime(5);
        isPrime(7);
    }
}
