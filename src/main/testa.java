package main;

import Dominio.Medida;
import Dominio.Velocidade.Velocidade;

public class testa {
    public static void main(String[] args) {

        Medida milha = new Velocidade("Milha/h", 2.23694);
        Medida pes = new Velocidade("Pés/s", 3.28084);
        Medida metros = new Velocidade("Metro/s", 1);
        Medida quilometros = new Velocidade("Quilômetro/h", 3.6);
        Medida no = new Velocidade("Nó", 1.94384);

        System.out.println(metros.converter(quilometros, 1));
        System.out.println(quilometros.converter(metros, 1));

        System.out.println(milha.converter(quilometros, 27.57));
    }
}
