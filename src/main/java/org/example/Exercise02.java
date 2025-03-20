package org.example;

public class Exercise02 {
    public static void main(String[] args) {
        int year = 1900;
        int month = 2;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days in this month is 31");
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    System.out.println("Number of days in this month is 29");
                } else {
                    System.out.println("Number of days in this month is 28");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days in this month is 30");
                break;
            default:
                System.out.println("The month is invalid");
        }
    }
}
