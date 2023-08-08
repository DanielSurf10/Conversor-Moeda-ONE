package Dominio.Conversores;

import Dominio.Moedas;
import Dominio.Temperaturas;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void cabecalho() {
        System.out.println("------------------------------");
        System.out.println("--------- Conversor ----------");
        System.out.println("------------- de -------------");
        System.out.println("-------- temperatura ---------");
        System.out.println("------------------------------");
    }

    public static void imprimirOpcoes() {
        System.out.println("Grau celsius    [ 1 ]");
        System.out.println("Kelvin          [ 2 ]");
        System.out.println("fahrenheit      [ 3 ]");
        System.out.println();
        System.out.print("Digite a sua opção: ");
    }

    public static Temperaturas receberOpcao(Scanner ler) {
        int opcao = ler.nextInt();

        while (!(opcao > 0 && opcao < 4)) {
            System.out.println("Opção inválida");
            System.out.print("Digite novamente: ");
            opcao = ler.nextInt();
        }

        return switch (opcao) {
            case 1 -> Temperaturas.GRAU_CELSIUS;
            case 2 -> Temperaturas.KELVIN;
            case 3 -> Temperaturas.FAHRENHEIT;
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

        while (continuar) {
            cabecalho();
            System.out.println();

            System.out.println("Temperatura a ser convertida: ");
            imprimirOpcoes();
            Temperaturas temperatura1 = receberOpcao(ler);
            System.out.print("Quanto: ");
            double quantidadeASerConvertida = ler.nextDouble();

            System.out.print("Para qual temperatura: ");
            Temperaturas temperatura2 = receberOpcao(ler);

            double quantidadeResultado = (double) Math.round(temperatura1.converter(temperatura2, quantidadeASerConvertida) * 100.0) / 100;

            System.out.printf("%f %s -> %f %s", quantidadeASerConvertida, temperatura1.name().toLowerCase(),
                    quantidadeResultado, temperatura2.name().toLowerCase());

            System.out.print("\n\nDejesa continuar no conversor de temperatura? [ 0 (Não) / 1 (Sim) ]: ");
            continuar = continuar(ler);
            System.out.println();
        }
    }
}
