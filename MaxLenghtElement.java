import java.util.Scanner;

public class MaxLenghtElement {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите словесный понос: ");
        String s = in.nextLine();
        String[] word = s.split(" ");
        String max = " ";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= max.length()) {
                max = word[i];
            }
        }
        System.out.println("");
        System.out.println("Максимально длинное слово: ");
        System.out.println(max);
        System.out.println("Максимальная длинна слова: ");
        System.out.println(max.length());
        System.out.println("");
    }
}