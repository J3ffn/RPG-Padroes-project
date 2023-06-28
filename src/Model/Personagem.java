package src.Model;

import src.Interface.EstadoPersonagem;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Personagem {
    private EstadoPersonagem estadoAtual;
    private BufferedImage imagem;

    public void setEstado(EstadoPersonagem estado) {
        this.estadoAtual = estado;
    }

    public void executarAcao() {
        estadoAtual.executarAcao();
    }
}
