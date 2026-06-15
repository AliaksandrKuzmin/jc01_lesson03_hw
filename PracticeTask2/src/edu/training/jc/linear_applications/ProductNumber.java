import java.util.Scanner;

 void main() {
    int num;
    int d1;
    int d2;
    int d3;
    int d4;
    int product;

    num = readFromConsole();
    d1 = num / 1000;
    d2 = num / 100 % 10;
    d3 = num / 10 % 10;
    d4 = num % 10;
    product = d1 * d2 * d3 * d4;

    System.out.println("Число: " + num);
    System.out.println("Произведения цифр числа: " + product);
}

public static int readFromConsole() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Введите четырёхзначное число: ");
    int number = sc.nextInt();

    while(true) {
        if (number < 1000 || number > 9999) {
            System.out.println("Число должно быть четырехзначным");
            System.out.print("Введите четырёхзначное число: ");
            number = sc.nextInt();
        }else{
            break;
        }
    }

    return number;
}
