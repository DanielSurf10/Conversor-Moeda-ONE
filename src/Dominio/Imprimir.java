package Dominio;

import java.util.Scanner;

public class Imprimir {
    public static void cabecalho(String texto) {
        System.out.println("------------------------------");
        System.out.println("--------- Conversor ----------");

        if (texto != null) {
            texto = " " + texto + " ";
            int tamanhoDoEspaco = 30 - texto.length();
            int tamanhoPrefixo = tamanhoDoEspaco / 2;
            int tamanhoSufixo = (tamanhoDoEspaco + 1) / 2;

            String novoTexto = 30 > texto.length() ?
                    "-".repeat(tamanhoPrefixo) + texto + "-".repeat(tamanhoSufixo)
                    : texto;

            System.out.println("------------- de -------------");
            System.out.println(novoTexto);
        }

        System.out.println("------------------------------");
        System.out.println();
    }

    public static void cabecalho() {
        cabecalho(null);
    }

    public static void opcoes(String[] opcoes) {
        for (int i = 0; i < opcoes.length; i++) {
            int tamanhoString = opcoes[i].length();
            String stringImprimir = opcoes[i] + " ".repeat(16 - tamanhoString);
            System.out.printf("%s[ %d ]\n", stringImprimir, i + 1);
        }
        System.out.print("\nDigite a sua opção: ");
    }

    public static int validarOpcao(Scanner ler, int min, int max, int invalido) {
        int opcao = ler.nextInt();

        while (!(opcao > min - 1 && opcao < max + 1 && opcao != invalido)) {
            System.out.println("Opção inválida");
            System.out.print("Digite novamente: ");
            opcao = ler.nextInt();
        }
        System.out.println();

        return opcao;
    }

    public static int validarOpcao(Scanner ler, int max) {
        return validarOpcao(ler, 1, max, -1);
    }

    public static int validarOpcao(Scanner ler, int max, int invalido) {
        return validarOpcao(ler, 1, max, invalido);
    }

    public static boolean continuar(Scanner ler) {
        int opcao = validarOpcao(ler, 0, 1, -1);
        return opcao == 1;
    }
}
