package Model;

import java.awt.image.BufferedImage;
import States.EstadoPersonagem;

public abstract class Pocao extends Elemento{
    
    private String name;
    private String descricao;
    private BufferedImage imagem;
    private EstadoPersonagem estado;
    
    public Pocao(int xCantoEsquerdo, int xCantoDireito, int yCantoSuperior, int yCantoInferior) {
        super(xCantoEsquerdo, xCantoDireito, yCantoSuperior, yCantoInferior);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BufferedImage getImagem() {
        return imagem;
    }

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }

    public EstadoPersonagem getEstado() {
        return estado;
    }

    public void setEstado(EstadoPersonagem estado) {
        this.estado = estado;
    }

    public void mudarEstado(Personagem personagem) {
        personagem.setEstadoAtual(estado);
    }
}
