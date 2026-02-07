package EstruturaCondicional;

import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor para avaliação (Par/Ímpar): ");
        int N = scanner.nextInt();

        if (N % 2 != 0) {
            System.out.println("O número é ímpar");
        } else {
            System.out.println("O número é par");
        }

        scanner.close();
    }
}



