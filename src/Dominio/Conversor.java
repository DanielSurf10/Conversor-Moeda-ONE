package Dominio;

import java.util.Scanner;

public abstract class Conversor {
    protected String nomeConversor;
    public Medida[] medidas;
    public String[] opcoes;

    public Conversor(Medida[] medidas) {
        this.medidas = medidas;
        opcoes = new String[medidas.length];

        for (int i = 0; i < medidas.length; i++) {
            opcoes[i] = medidas[i].getNome();
        }
    }

    public String getNomeConversor() {
        return nomeConversor;
    }

    public void converter(Scanner ler) {
        boolean continuar = true;

        while (continuar) {
            Imprimir.cabecalho(nomeConversor);

            String nomeCaptalizado = nomeConversor.substring(0, 1)
                    .toUpperCase().concat(nomeConversor.substring(1));

            System.out.println(nomeCaptalizado + "a ser convertida: ");
            Imprimir.opcoes(opcoes);

            int opcao = Imprimir.validarOpcao(ler, opcoes.length);
            Medida medida1 = medidas[opcao - 1];

            System.out.print("Quanto: ");
            double quantidadeASerConvertida = ler.nextDouble();

            System.out.printf("Para qual %s: ", nomeConversor);
            Medida medida2 = medidas[Imprimir.validarOpcao(ler, opcoes.length, opcao) - 1];

            double quantidadeResultado = (double) Math.round(medida1.converter(medida2,
                    quantidadeASerConvertida) * 100.0) / 100;

            System.out.printf("%f %s -> %f %s", quantidadeASerConvertida, medida1.getNome().toLowerCase(),
                    quantidadeResultado, medida2.getNome().toLowerCase());

            System.out.printf("\n\nDejesa continuar no conversor de %s? [ 0 (Não) / 1 (Sim) ]: ", nomeConversor);

            continuar = Imprimir.continuar(ler);
        }
    }
}
