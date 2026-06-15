import java.util.Scanner;

void main() {
        double radius;
    System.out.print("Введите радиус окружности: ");
    radius = readFromConsole();

    areaCircle(radius);
    circumference(radius);
}

public void areaCircle(double r) {
    double s;

    s = Math.PI * Math.pow(r,2);

    System.out.println("Площадь круга равна: " + s);
}

public void circumference(double r) {
    double l;

    l = 2 * Math.PI * r;

    System.out.println("Длинна окружности равна: " + l);
}


public static double readFromConsole() {
    Scanner sc = new Scanner(System.in);
    double number;

    number = sc.nextDouble();

    return number;
}
