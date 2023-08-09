package main;

import Dominio.Conversor;
import Dominio.Imprimir;
import Dominio.Medida;
import Dominio.Moeda.ConversorMoeda;
import Dominio.Moeda.Moeda;
import Dominio.Temperatura.ConversorTemperatura;
import Dominio.Temperatura.Temperatura;
import Dominio.Velocidade.ConversorVelocidade;
import Dominio.Velocidade.Velocidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean continuar = true;
        Scanner ler = new Scanner(System.in);

        Conversor[] conversores = {
                new ConversorMoeda(new Medida[]{
                        new Moeda("Dólar", 1),
                        new Moeda("Peso Argentino", 283.19),
                        new Moeda("Yuan", 7.17),
                        new Moeda("Iene", 143.31),
                        new Moeda("Real", 4.90)
                }),
                new ConversorTemperatura(new Medida[]{
                        new Temperatura("Grau Celsius", 0),
                        new Temperatura("Kelvin", 273.15),
                        new Temperatura("Fahrenheit", 32)
                }),
                new ConversorVelocidade(new Medida[]{
                        new Velocidade("Milha/h", 2.23694),
                        new Velocidade("Pés/s", 3.28084),
                        new Velocidade("Metro/s", 1),
                        new Velocidade("Quilômetro/h", 3.6),
                        new Velocidade("Nó", 1.94384)
                })
        };

        String[] tiposConversores = new String[conversores.length];
        for (int i = 0; i < tiposConversores.length; i++) {
            tiposConversores[i] = conversores[i].getNomeConversor();
        }

        while (continuar) {
            Imprimir.cabecalho();
            Imprimir.opcoes(tiposConversores);

            int opcaoConversor = Imprimir.validarOpcao(ler, conversores.length);

            Conversor conversor = conversores[opcaoConversor - 1];

            conversor.converter(ler);
            System.out.print("Dejesa continuar no conversor? [ 0 (Não) / 1 (Sim) ]: ");
            continuar = Imprimir.continuar(ler);
        }

    }
}
