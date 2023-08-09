package main;

import Dominio.*;
import Dominio.Moeda.ConversorMoeda;
import Dominio.Temperatura.ConversorTemperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean continuar = true;
        Scanner ler = new Scanner(System.in);
        String[] tiposConversores = {"Moeda", "Temperatura", "Velocidade", "Área"};
        Conversor[] conversores = {
                new ConversorMoeda("Moeda"),
                new ConversorTemperatura("Temperatura")
        };

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
