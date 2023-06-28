package src.Model;

import src.Interface.EstadoPersonagem;
import src.States.EstadoAndando;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Personagem {
    private EstadoPersonagem estadoAtual;
    private BufferedImage imagem;

    public Personagem() {
        // Estado inicial: Andando
        try {
            imagem = ImageIO.read(new File("./img/background/Leowood.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        estadoAtual = new EstadoAndando();
    }

    public void setEstado(EstadoPersonagem estado) {
        this.estadoAtual = estado;
    }

    public void executarAcao() {
        estadoAtual.executarAcao();
    }
}
