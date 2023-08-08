package Dominio.Conversores;

import Dominio.Moedas;

import java.util.Scanner;

public class ConversorMoeda {

    public static void cabecalho() {
        System.out.println("------------------------------");
        System.out.println("--------- Conversor ----------");
        System.out.println("------------- de -------------");
        System.out.println("----------- moeda ------------");
        System.out.println("------------------------------");
    }

    public static void moedas() {
        System.out.println("Dolar           [ 1 ]");
        System.out.println("Euro            [ 2 ]");
        System.out.println("Yuan Chinês     [ 3 ]");
        System.out.println("Iene Japones    [ 4 ]");
        System.out.println("Real            [ 5 ]");
        System.out.println();
        System.out.print("Digite a sua opção: ");
    }

    public static Moedas opcoesMoedas(Scanner ler) {
        int opcao = ler.nextInt();

        while (!(opcao > 0 && opcao < 6)) {
            System.out.println("Opção inválida");
            System.out.print("Digite novamente: ");
            opcao = ler.nextInt();
        }

        return switch (opcao) {
            case 1 -> Moedas.DOLAR;
            case 2 -> Moedas.EURO;
            case 3 -> Moedas.YUAN;
            case 4 -> Moedas.IENE;
            case 5 -> Moedas.REAL;
            default -> null;
        };
    }

    public static boolean continuar(Scanner ler) {
        int opcao = ler.nextInt();

        while (!(opcao == 0 || opcao == 1)) {
            System.out.println("Opção inválida");
            System.out.print("Digite novamente: ");
            opcao = ler.nextInt();
        }

        return opcao == 1;
    }

    public static void conversor() {
        Scanner ler = new Scanner(System.in);
        boolean continuar = true;
        double quantidadeASerConvertida = 0;
        double quantidadeResultado = 0;
        Moedas moeda1;
        Moedas moeda2;

        while (continuar) {
            cabecalho();
            System.out.println();

            System.out.println("Moeda a ser convertida: ");
            moedas();
            moeda1 = opcoesMoedas(ler);
            System.out.print("Quanto: ");
            quantidadeASerConvertida = ler.nextDouble();

            System.out.print("Para qual moeda: ");
            moeda2 = opcoesMoedas(ler);

            // Math.round(moeda1.converter(moeda2, quantidadeASerConvertida) * 100d) / 100;
            quantidadeResultado = (double) Math.round(moeda1.converter(moeda2, quantidadeASerConvertida) * 100.0) / 100;
            System.out.printf("%f %s -> %f %s", quantidadeASerConvertida, moeda1.name().toLowerCase(),
                    quantidadeResultado, moeda2.name().toLowerCase());

            System.out.print("\nContinuar? [ 0 (Não) / 1 (Sim) ]: ");
            continuar = continuar(ler);
        }
        System.out.println();
    }
}
