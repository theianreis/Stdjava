package EstruturadeRepe;

import java.util.Scanner;

public class SomaMultiplos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i < N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos múltiplos de 3 ou 5 menores que " + N + " é: " + soma);

        scanner.close();
    }
}
