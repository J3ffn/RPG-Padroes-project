package Model;

import java.awt.image.BufferedImage;
import javax.swing.JComponent;
import States.EstadoPersonagem;

public class Pocao extends Elemento{
    
    private String nome;
    private BufferedImage imagem;
    private EstadoPersonagem estado;
    
    public Pocao(int xCantoEsquerdo, int xCantoDireito, int yCantoSuperior, int yCantoInferior) {
        super(xCantoEsquerdo, xCantoDireito, yCantoSuperior, yCantoInferior);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (estado == null){
            personagem.ganharVida(10);
        }
        personagem.setEstadoAtual(estado);
    }


}
