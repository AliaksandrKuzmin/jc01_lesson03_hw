package edu.training.jc.linear_applications;
import java.util.Scanner;

public class PerimeterRectangle {
    static void main() {
        double legOne;
        double legTwo;
        double hypotenuse;

        System.out.print("Введите первый катет прямоугольного треугольника: ");
        legOne = readFromConsole();
        System.out.print("Введите второй катет прямоугольного треугольника: ");
        legTwo = readFromConsole();
        System.out.print("Введите гипотенузу прямоугольного треугольника: ");
        hypotenuse = readFromConsole();

        perimeterCoating(legOne, legTwo, hypotenuse);
        squareCoating(legOne, legTwo);
    }

    public static double readFromConsole() {
        Scanner sc = new Scanner(System.in);
        double number;

        number = sc.nextDouble();

        return number;
    }

    public static void perimeterCoating(double a, double b, double c) {
        double perimeter;

        perimeter = a + b + c;

        System.out.println("Периметр прямоугольного треугольника равен: " + perimeter);
    }

    public static void squareCoating(double a, double b) {
        double square;

        square = (a * b) / 2;

        System.out.println("Площадь прямоугольного прямоугольника равен: " + square);
    }
}
