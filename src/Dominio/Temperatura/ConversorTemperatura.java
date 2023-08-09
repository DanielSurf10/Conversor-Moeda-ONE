package Dominio.Temperatura;

import Dominio.Conversor;
import Dominio.Medida;

public class ConversorTemperatura extends Conversor {
    public ConversorTemperatura(Medida[] medidas) {
        super(medidas);
        nomeConversor = "Temperatura";
    }
}
