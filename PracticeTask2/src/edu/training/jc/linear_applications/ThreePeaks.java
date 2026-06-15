import java.util.Scanner;
void main() {
    double x1;
    double x2;
    double x3;
    double y1;
    double y2;
    double y3;
    double a;
    double b;
    double c;

    System.out.print("Введите значение х1: ");
    x1= readFromConsole();
    System.out.print("Введите значение х2: ");
    x2= readFromConsole();
    System.out.print("Введите значение х3: ");
    x3= readFromConsole();
    System.out.print("Введите значение y1: ");
    y1= readFromConsole();
    System.out.print("Введите значение y2: ");
    y2= readFromConsole();
    System.out.print("Введите значение y3: ");
    y3= readFromConsole();

    a = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
    b = Math.sqrt( Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2) );
    c = Math.sqrt( Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2) );

    double perimeter = a + b + c;
    System.out.println("Периметр треугольника равен: " + perimeter);
    area(perimeter, a, b, c);
}

public void area(double perimeter, double a, double b, double c) {
    double p = perimeter / 2;
    double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
    System.out.println("Площадь треугольника равна: " + area);
}

public static double readFromConsole() {
    Scanner sc = new Scanner(System.in);
    double number;

    number = sc.nextDouble();

    return number;
}
