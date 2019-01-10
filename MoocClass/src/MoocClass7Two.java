public class MoocClass7Two {
    public static void sum(int a, int b) {
        int i = 0;
        int sum = 0;
        for (i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(a + "到" + b + "的和是" + sum);
    }

    public static void f(){
        System.out.println("f()");
    }

    public static void main(String[] args) {
        f();
        sum(1, 10);
        sum(20, 30);
        sum(35, 45);
    }
}
