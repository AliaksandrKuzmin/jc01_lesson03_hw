import java.util.Scanner;

    void main() {
        double x1;
        double x2;
        double y1;
        double y2;

        System.out.print("Введите значение х1: ");
        x1 = readFromConsole();
        System.out.print("Введите значение х2: ");
        x2 = readFromConsole();
        System.out.print("Введите значение y1: ");
        y1 = readFromConsole();
        System.out.print("Введите значение y2: ");
        y2 = readFromConsole();

        distance(x1, x2, y1, y2);
    }

    public static void distance (double a, double b, double i, double j) {
        double pow = Math.pow(b - a, 2);
        double pow2 = Math.pow(j - i, 2);
        double distance =  Math.sqrt(pow+pow2);
        System.out.println("Расстояние между двумя точками равно: " + distance);
    }

    public static double readFromConsole() {
    Scanner sc = new Scanner(System.in);
    double number;

    number = sc.nextDouble();

    return number;
    }

