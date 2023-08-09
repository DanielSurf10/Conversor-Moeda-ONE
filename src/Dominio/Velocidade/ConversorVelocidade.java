package Dominio.Velocidade;

import Dominio.Conversor;
import Dominio.Medida;

public class ConversorVelocidade extends Conversor {
    public ConversorVelocidade(Medida[] medidas) {
        super(medidas);
        nomeConversor = "Velocidade";
    }
}
