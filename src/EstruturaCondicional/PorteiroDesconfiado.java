package EstruturaCondicional;

import java.util.Scanner;

public class PorteiroDesconfiado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você é maior de idade? (1-Sim / 0-Não): ");
        int idade = scanner.nextInt();

        System.out.print("Você trouxe convite? (1-Sim / 0-Não): ");
        int convite = scanner.nextInt();

        if (idade == 1 && convite == 1) {
            System.out.println("Entrada permitida 🎉");
        }
        else if (idade == 0 && convite == 1) {
            System.out.println("Convite sem idade não cola 😅");
        }
        else if (idade == 1 && convite == 0) {
            System.out.println("Maior de idade, mas sem convite 😬");
        }
        else {
            System.out.println("Entrada negada 🚫");
        }

        scanner.close();
    }
}
