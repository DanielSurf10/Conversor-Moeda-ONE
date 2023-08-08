package main;

import Dominio.Conversores.ConversorMoeda;
import Dominio.ConversoresEnum;

import java.util.Scanner;

public class Main {

    public static void cabecalho() {
        System.out.println("------------------------------");
        System.out.println("--------- Conversor ----------");
        System.out.println("------------------------------");
        System.out.println();
    }

    public static void menu() {
        System.out.println("Moeda           [ 1 ]");
        System.out.println("Temperatura     [ 2 ]");
        System.out.println("Velocidade      [ 3 ]");
        System.out.println("Área            [ 4 ]");
        System.out.println();
        System.out.print("Digite a sua opção: ");
    }

    public static ConversoresEnum conversor(Scanner ler) {
        int opcao = ler.nextInt();

        while (!(opcao > 0 && opcao < 5)) {
            System.out.println("Opção inválida");
            System.out.print("Digite novamente: ");
            opcao = ler.nextInt();
        }

        return switch (opcao) {
            case 1 -> ConversoresEnum.MOEDA;
            case 2 -> ConversoresEnum.TEMPERATURA;
            case 3 -> ConversoresEnum.VELOCIDADE;
            case 4 -> ConversoresEnum.AREA;
            default -> null;
        };
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        cabecalho();
        menu();

        ConversoresEnum conversor = conversor(ler);
        System.out.println();

        if (conversor == ConversoresEnum.MOEDA) {
            ConversorMoeda.conversor();
        }

    }
}
