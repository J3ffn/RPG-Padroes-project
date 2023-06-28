package States;

import Model.Personagem;
import java.util.Objects;

public class EstadoBase extends EstadoPersonagem{

    public EstadoBase() {
        setVelocidade(1);
        setDefesa(0);
        setAtaque(2);
        setVidaMaxima(10);
    }

    public EstadoBase(float velocidade, int defesa, int ataque, int vidaMaxima) {
        setVelocidade(velocidade);
        setDefesa(defesa);
        setAtaque(ataque);
        setVidaMaxima(vidaMaxima);
    }

    
    @Override
    public String toString() {
        return "{" +
            " velocidade='" + getVelocidade() + "'" +
            ", defesa='" + getDefesa() + "'" +
            ", ataque='" + getAtaque() + "'" +
            ", vidaMaxima='" + getVidaMaxima() + "'" +
            "}";
    }
    
}
