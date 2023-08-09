package Dominio;

import java.util.Scanner;

public abstract class Conversor {

    protected String nomeConversor;
    public ConversorMedida[] conversorMedidas;
    public String[] opcoes;

    public void converter(Scanner ler) {
        boolean continuar = true;

        while (continuar) {
            Imprimir.cabecalho(nomeConversor);

            String nomeCaptalizado = nomeConversor.substring(0, 1)
                    .toUpperCase().concat(nomeConversor.substring(1));

            System.out.println(nomeCaptalizado + "a ser convertida: ");
            Imprimir.opcoes(opcoes);

            int opcao = Imprimir.validarOpcao(ler, opcoes.length);
            ConversorMedida medida1 = conversorMedidas[opcao - 1];

            System.out.print("Quanto: ");
            double quantidadeASerConvertida = ler.nextDouble();

            System.out.printf("Para qual %s: ", nomeConversor);
            ConversorMedida medida2 = conversorMedidas[Imprimir.validarOpcao(ler, opcoes.length, opcao) - 1];

            double quantidadeResultado = (double) Math.round(medida1.converter(medida2,
                    quantidadeASerConvertida) * 100.0) / 100;

            System.out.printf("%f %s -> %f %s", quantidadeASerConvertida, medida1.getNome().toLowerCase(),
                    quantidadeResultado, medida2.getNome().toLowerCase());

            System.out.printf("\n\nDejesa continuar no conversor de %s? [ 0 (Não) / 1 (Sim) ]: ", nomeConversor);

            continuar = Imprimir.continuar(ler);
        }
    }
}
