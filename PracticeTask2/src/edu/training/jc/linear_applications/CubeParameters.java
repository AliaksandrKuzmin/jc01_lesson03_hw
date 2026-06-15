import java.util.Scanner;

void main() {
    double edgeCube;
    double face;
    double surface;
    double volume;

    edgeCube = readFromConsole();

    face = Math.pow(edgeCube, 2);
    System.out.println("Площадь одной грани куба равна: " + face);

    surface = 6 * Math.pow(edgeCube, 2);
    System.out.println("Площадь полной поверхности куба равна: " + surface);

    volume = Math.pow(edgeCube, 3);
    System.out.println("Объем куба равен: " + volume);
}

public static double readFromConsole() {
    Scanner sc = new Scanner(System.in);
    double number;

    System.out.print("Введите длину ребра куба: ");
    number = sc.nextDouble();

    return number;
}