import java.util.Calendar;
import java.util.Scanner;

public class ClassZhangFour {
    private static long i;

    private static void printTicketType() {
        Calendar c = Calendar.getInstance();
        int b = c.get(Calendar.YEAR);
        // 获得当前时间的年份
        int a = (int) ((i % 100000000) / 10000);
        int d = b - a;
        if (d > 12 && i != 0) {
            System.out.println("成人票--全价");
        } else if (d > 2 && d < 12 && i != 0) {
            System.out.println("儿童票--50%off");
        } else if (d < 2 && i != 0){
            System.out.println("婴儿票--90%off");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====查询飞机票类型====");
        System.out.println("====输入0退出程序====");
        for (; ; ) {
            System.out.print("请输入身份证号:");
            i = in.nextLong();
            printTicketType();
            if (i == 0) {
                System.out.println("======退出程序=======");
                break;
            }
        }
    }
}

