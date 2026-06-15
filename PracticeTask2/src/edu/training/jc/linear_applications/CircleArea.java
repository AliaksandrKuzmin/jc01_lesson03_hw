import java.util.Scanner;

void main() {
    double circumference;
    double radius;
    double area;

    circumference = readFromConsole();
    radius = circumference / (2 * Math.PI);
    area = Math.PI * Math.pow(radius, 2);

    System.out.println("Площадь круга равна: " + area);
}

public static double readFromConsole() {
    Scanner sc = new Scanner(System.in);
    double number;

    System.out.print("Введите длину окружности: ");

    number = sc.nextDouble();

    return number;
}