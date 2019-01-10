import java.util.Scanner;

public class ClassZhangOne {
    private static int i;
    private static int a;

    public static boolean isLeapYear() {
        boolean isLeapYear = false;
        if (i % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        return isLeapYear;
    }

    public static void DaysNumber() {
        if (a == 4 || a == 6 || a == 9 || a == 11) {
            System.out.println("这个月有30天");
        } else if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            System.out.println("这个月有31天");
        } else if (isLeapYear() && a == 2) {
            System.out.println("这个月有29天");
        } else {
            System.out.println("这个月有28天");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        a = in.nextInt();
        DaysNumber();
    }
}
