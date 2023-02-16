package ex_2;//Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям ex_2.Rectangle.
// У тілі класу створити два поля, що описують довжини сторін double side1, double side2.
// Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2)
// і периметр прямокутника - double perimeterCalculator
// (double side1, double side2). Написати програму, яка приймає від користувача довжини двох сторін прямокутника
// і виводить на екран периметр та площу.

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть довжину сторони а: ");
        double side1 = in.nextDouble();
        System.out.println("Введіть довжину сторони b: ");
        double side2 = in.nextDouble();
        System.out.println("Периметр прямокутника = " + perimeterCalculator(side1,side2));
        System.out.println("Площа прямокутника = " + areaCalculator(side1,side2));
    }
    static double areaCalculator (double side1, double side2) {
        return side1 * side2;
    }
    static double perimeterCalculator (double side1, double side2) {
        return 2 * (side1 + side2);
    }

}
