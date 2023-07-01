package Model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import States.EstadoPersonagem;

public class Pocao extends Elemento {

  private String nome;
  private String descricao;
  private BufferedImage imagem;
  private EstadoPersonagem estado;
  private String caminho;

  public Pocao(int xEsquerdo, int yCima, String caminho) {
    super(xEsquerdo, yCima);
    this.caminho = caminho;
    setBounds(xEsquerdo, yCima, 79, 88);
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

  public void mudarEstado(Personagem personagem) {
    personagem.setEstadoAtual(estado);
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);

    BufferedImage imagem = null;
    try {
      imagem = ImageIO.read(new File(caminho));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    
    g.drawImage(imagem, 0, 0, imagem.getWidth() - 5, imagem.getHeight() - 5, null);
  }

}
