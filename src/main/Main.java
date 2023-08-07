package main;

import cotacao.Cotacao;
import cotacao.DolarToBRL;
import cotacao.EuroToBRL;
import cotacao.Moedas;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Moedas moedas = new Moedas();
        Cotacao dolar = moedas.getDolarToBRL().getCotacao();
        Cotacao euro = moedas.getEuroToBRL().getCotacao();



        System.out.println(dolar.getNome() + " " + dolar.getAsk());
        System.out.println(euro.getNome() + " " + euro.getAsk());
    }
}
