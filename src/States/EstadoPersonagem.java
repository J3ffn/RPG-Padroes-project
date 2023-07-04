package States;

import Model.Personagem;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class EstadoPersonagem {

  private float velocidade;
  private int defesa;
  private int ataque;
  private int vidaMaxima; 
  protected Personagem personagem;

  public float getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(float velocidade) {
    this.velocidade = velocidade;
  }

  public int getDefesa() {
    return defesa;
  }

  public void setDefesa(int defesa) {
    this.defesa = defesa;
  }

  public int getAtaque() {
    return ataque;
  }

  public void setAtaque(int ataque) {
    this.ataque = ataque;
  }

  public int getVidaMaxima() {
    return vidaMaxima;
  }

  public void setVidaMaxima(int vidaMaxima) {
    this.vidaMaxima = vidaMaxima;
  }

  public boolean atacar(Personagem inimigo) {
    int defesaInimigo = inimigo.getEstadoAtual().getDefesa();
    if (defesaInimigo >= getAtaque())
      return false;
    else {
      inimigo.perderVida(getAtaque());
      return true;
    }
  }

  public void ajustarVidaPersonagem() {
    if (personagem == null)
      personagem = Personagem.getPersonagem();
    int vidaMaximaAtual = this.getVidaMaxima();
    if (personagem.getVida() > vidaMaximaAtual) {
      int diferenca = personagem.getVida() - vidaMaximaAtual;
      personagem.perderVida(diferenca);
    }
  }

  public String toString() {
    return "Velocidade= " + getVelocidade() + "<br>" +
        "Defesa= " + getDefesa() + "<br>" +
        "Ataque= " + getAtaque();
  }
}
