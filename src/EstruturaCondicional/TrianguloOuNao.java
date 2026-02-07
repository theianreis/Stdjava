package EstruturaCondicional;

import java.util.Scanner;

public class TrianguloOuNao {

    public static void testTriang(int a, int b, int c) {

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Não é triângulo");
        } else {
            System.out.println("É triângulo");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado a: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor do lado b: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor do lado c: ");
        int C = scanner.nextInt();

        testTriang(A, B, C);

        scanner.close();
    }
}
