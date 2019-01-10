import java.util.Scanner;

public class MoocClass7One {
    public static boolean isPrime(int i) {
        boolean isPrime = true;
        for (int k = 2; k < i; k++) {
            isPrime = false;
            break;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if (m == 1) {
            m = 2;
        }
        int cut = 0;
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                cut++;
                sum += i;
            }
        }
        System.out.println("在" + m  + "和" + n + "中有" + cut + "个素数,中和为" + sum);
    }
}
