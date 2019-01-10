package charpter6_3;

import java.util.Scanner;

public class printCale {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full year eg 2012:");
        int year = input.nextInt();
        System.out.println("Enter month as number between 1 to 12:");
        int month = input.nextInt();

        printMonth(year, month);

    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("    " + printMonthName(month) + " " + year);
        System.out.println("---------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

    }

    public static void printMonthBody(int year, int month) {

        int startday = getStartDay(year, month);
        for (int i = 0; i < startday; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= getNumberOfDaysInMonth(year, month); i++) {
            System.out.printf("%4d", i);
            if ((i + startday) % 7 == 0) {
                System.out.println();
            }
        }

    }

    public static String printMonthName(int month) {
        String name = "";
        switch (month) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "January";
                break;
            case 3:
                name = "January";
                break;
            case 4:
                name = "January";
                break;
            case 5:
                name = "January";
                break;
            case 6:
                name = "January";
                break;
            case 7:
                name = "January";
                break;
            case 8:
                name = "January";
                break;
            case 9:
                name = "January";
                break;
            case 10:
                name = "January";
                break;
            case 11:
                name = "January";
                break;
            case 12:
                name = "January";
                break;
        }
        return name;
    }

    public static int getStartDay(int year, int month) {
        final int START = 0;

        int startDay = (getTotalNumberOfDays(year, month) + START) % 7;

        return startDay;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int day = 0;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(year)) {
                day += 366;
            } else {
                day += 365;
            }
        }

        for (int i = 1; i < month; i++) {
            day += getNumberOfDaysInMonth(year, i);
        }

        return day;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {

        int day = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                || month == 12) {
            day = 31;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                day = 29;
            } else {
                day = 28;
            }
        } else {
            day = 30;
        }

        return day;
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

