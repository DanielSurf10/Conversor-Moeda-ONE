package Dominio.Moeda;

import Dominio.Conversor;
import Dominio.Medida;

public class ConversorMoeda extends Conversor {
    public ConversorMoeda(Medida[] medidas) {
        super(medidas);
        nomeConversor = "Moeda";
    }
}
