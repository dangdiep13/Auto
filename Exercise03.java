package org.example;

public class Exercise03 {
    public static void main(String[] args) {
//        1. In ra các số chẵn từ 1-> 100
        System.out.println("1. Cac so chan tu 1 den 100 la: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            if (i == 100) {
                System.out.println();
            }
        }

//        2. In ra bảng cứu chương
        System.out.println("2. Bang cuu chuong:");
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println(a + " x " + b + " = " + a * b);
                if (b == 10) {
                    System.out.println();
                }
            }
        }

//        3. Kiem tra so lon nhat trong 3 so
        int a = 1, b = 11, c = 111;
        int m = Math.max(a, b);
        if (m > c) {
            System.out.println("3. So lon nhat trong 3 so " + a + ", " + b + ", " + c + " la: " + m);
        } else {
            System.out.println("3. So lon nhat trong 3 so " + a + ", " + b + ", " + c + " la: " + c);
        }
    }
}
