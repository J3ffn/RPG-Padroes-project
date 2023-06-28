package Model;

import States.EstadoPersonagem;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Personagem {
    private EstadoPersonagem estadoAtual;
    private int vida;

    public int getVida() {
        return vida;
    }
    private BufferedImage imagem;

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

    public boolean atacar(Personagem inimigo){
        return estadoAtual.atacar(inimigo); 
    }

    public boolean isVivo() {
        return vida >= 1;

    }

    public void perderVida(int dano) {
        vida -= dano;
    }
}
