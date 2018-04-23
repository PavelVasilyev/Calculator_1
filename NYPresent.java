import java.util.Scanner;

class Present {
    String name; //Наименование
    float weight; // Вес
    float price; // Ценик
    int id; // ID сладости
}

class NYPresent {
    NYPresent() {
        int n;
        Scanner ini = new Scanner(System.in);
        System.out.println("Введите кол-во подарков: ");
        n = ini.nextInt();
        Present Box[] = new Present[n];
        for (int i = 0; i < n; i++) {
            Box[i] = new Present();
        }
        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите наименование сладости ");
            Box[i].name = in.nextLine();
            System.out.println("Введите вес сладости ");
            Box[i].weight = in.nextFloat();
            System.out.println("Введите ценник сладости ");
            Box[i].price = in.nextFloat();
            System.out.println("Введите ID сладости ");
            Box[i].id = in.nextInt();
            System.out.println("");
        }
        double sumW = 0.0, sumCost = 0.0;
        for (int i = 0; i < n; i++) {
            sumW = sumW + Box[i].weight;
            sumCost = sumCost + Box[i].price;
        }
        System.out.println("");
        System.out.println("");
        System.out.printf("Общий вес сладостей и всего подарка: %.2f \n", sumW);
        System.out.printf("Общая стоимость всех сладостей и всего подарка: %.2f \n", sumCost);
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s | %.2f | %.2f | %d |\n", Box[i].name, Box[i].weight, Box[i].price, Box[i].id);
        }
        System.out.println("");
        System.out.println("");
    }
}