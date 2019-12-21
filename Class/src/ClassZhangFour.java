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
            System.out.println("Adult Ticket: Passenger over 12, Full price");
        } else if (d > 2 && d < 12 && i != 0) {
            System.out.println("Children Ticket: kids 2-12, Save 50%");
        } else if (d < 2 && i != 0){
            System.out.println("Infant Ticket: infant under 2, Ride free");
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

