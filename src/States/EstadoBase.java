package States;
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
    
}
