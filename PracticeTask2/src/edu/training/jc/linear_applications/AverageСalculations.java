import java.util.Scanner;

static void main() {
    double number1;
    double number2;

    System.out.print("Введите первое число: ");
    number1 = readFromConsole();
    System.out.print("Введите второе число: ");
    number2 = readFromConsole();

    arithmeticMeanCubes(number1, number2);
    geometricMeanModules(number1, number2);
}

public static void arithmeticMeanCubes(double a, double b) {
    double arityMean;
    arityMean = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
    System.out.println("Среднее арифметическое кубов равно: " + arityMean);
}

public static void geometricMeanModules(double a, double b) {
    double geomMean;
    geomMean = Math.sqrt( Math.abs(a) * Math.abs(b) );
    System.out.println("Среднее геометрическое модулей равно: " + geomMean);
}

public static double readFromConsole() {
    Scanner sc = new Scanner(System.in);
    double number;

    number = sc.nextDouble();

    return number;
}
