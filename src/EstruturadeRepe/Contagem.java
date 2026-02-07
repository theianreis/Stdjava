package EstruturadeRepe;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite N: ");
        int N = scanner.nextInt();

        for (int i = N; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
