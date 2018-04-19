import java.util.Scanner;

public class Calculator {
    //напишите тут ваш код
    Calculator() {
        Scanner scanner = new Scanner(System.in); // Создаем чтение потока с клавиатруры

        System.out.println("Введите первое число");
        double x = scanner.nextDouble(); // Читаем первое число, присваиваем его переменной

        System.out.println("Введите второе число");
        double y = scanner.nextDouble(); // Читаем второе число, присваиваем его переменной

        System.out.println("Введите требуемую операцию");
        System.out.println("1 - сложение \t" + "2 - вычитание \t" + "3 - умножение \t" + "4- деление");

        double z = scanner.nextDouble(); // Читаем знак операции

        if (z == 1) {                     // условие для сложения
            double w = x + y;
            scanner.close();
            System.out.printf("%.4f", w);

        }

        if (z == 2) {                    // условие для вычитания //
            double w = x - y;
            scanner.close();
            System.out.printf("%.4f", w);

        }

        if (z == 3) {                    // условие для умножения
            double w = x * y;
            scanner.close();
            System.out.printf("%.4f", w);

        }

        if (z == 4) {                     // условие для деления
            double w = x / y;
            scanner.close();
            System.out.printf("%.4f", w);

        }
    }

}
