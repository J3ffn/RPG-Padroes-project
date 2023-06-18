package Model;

import Interface.EstadoPersonagem;
import States.EstadoAndando;

public class Personagem {
    private EstadoPersonagem estadoAtual;

    public Personagem() {
        // Estado inicial: Andando
        estadoAtual = new EstadoAndando();
    }

    public void setEstado(EstadoPersonagem estado) {
        this.estadoAtual = estado;
    }

    public void executarAcao() {
        estadoAtual.executarAcao();
    }
}
