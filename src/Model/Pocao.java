package Model;

import java.awt.image.BufferedImage;
import javax.swing.JComponent;
import States.EstadoPersonagem;

public class Pocao extends Elemento{
    
    private String nome;
    private String descricao;
    private BufferedImage imagem;
    private EstadoPersonagem estado;

    private JComponent jComponent;
    
    public Pocao(int xCantoEsquerdo, int xCantoDireito, int yCantoSuperior, int yCantoInferior) {
        super(xCantoEsquerdo, xCantoDireito, yCantoSuperior, yCantoInferior);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public JComponent getJComponent() {
        return jComponent;
    }

    public void setJComponent(JComponent jComponent) {
        this.jComponent = jComponent;
    }

    public void mudarEstado(Personagem personagem) {
        personagem.setEstadoAtual(estado);
    }


}
