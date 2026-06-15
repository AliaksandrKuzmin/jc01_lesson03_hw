import java.util.Scanner;

void main() {
    double sideTriangle;
    double height;
    double area;
    double r;
    double bigR;

    sideTriangle = readFromConsole();

    height = (Math.sqrt(3) / 2) * sideTriangle;
    System.out.println("Высота равностороннего треугольника равна: " + height);

    area = (Math.sqrt(3) / 4) * Math.pow(sideTriangle, 2);
    System.out.println("Площадь равностороннего треугольника равна: " + area);

    r = height / 3;
    System.out.println("Радиус вписанной окружности равностороннего треугольника равен: " + r);

    bigR = (2 * height) / 3;
    System.out.println("Радиус описанной окружности равностороннего треугольника равен: " + bigR);

}

public static double readFromConsole() {
    Scanner sc = new Scanner(System.in);
    double number;

    System.out.print("Введите сторону прямоугольного треугольника: ");
    number = sc.nextDouble();

    return number;
}