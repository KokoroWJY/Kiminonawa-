import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Fraction a = new Fraction(in.nextInt(), in.nextInt());

        Fraction b = new Fraction(in.nextInt(), in.nextInt());

        a.print();

        b.print();

        a.plus(b).print();

        a.multiply(b).plus(new Fraction1(5, 6)).print();

        a.print();

        b.print();

        in.close();
    }
}
