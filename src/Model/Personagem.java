package src.Model;

import src.States.EstadoPersonagem;

public abstract class Personagem {
    private EstadoPersonagem estadoAtual;
    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public EstadoPersonagem getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoPersonagem estadoAtual) {
        this.estadoAtual = estadoAtual;
        int vidaMaximaAtual = getEstadoAtual().getVidaMaxima();
        if (getVida() > vidaMaximaAtual) {
            int diferenca = getVida() - vidaMaximaAtual;
            perderVida(diferenca);
        }
    }

    public void executarAcao() {
        // TODO Auto-generated method stub

    }

    public boolean isVivo() {
        return vida >= 1;

    }

    public void perderVida(int dano) {
        vida -= dano;
    }

}
