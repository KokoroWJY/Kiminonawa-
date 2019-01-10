import java.util.Scanner;

public class ClassZhangNine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入成绩 : ");
        String str = in.nextLine();
        String[] arr = str.split("\\s+");
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}