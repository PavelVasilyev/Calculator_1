import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("1 - Массив\n2 - Калькулятор ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                new MaxLenghtElement();
                break;
            case 2:
                new Calculator();
                break;
        }
    }

}