package Model;

import States.EstadoBase;
import States.EstadoPersonagem;

public class Personagem {

  private EstadoPersonagem estadoAtual;
  private int vida;
  private static Personagem personagem;

  public Personagem() {
    vida = 10;
  }

  public int getVida() {
    return vida;
  }

  public synchronized static Personagem getPersonagem() {
    if (personagem == null)
      personagem = new Personagem();
    if (personagem.getEstadoAtual() == null)
      personagem.setEstadoAtual(new EstadoBase());
    return personagem;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public EstadoPersonagem getEstadoAtual() {
    return estadoAtual;
  }

  public void setEstadoAtual(EstadoPersonagem estadoAtual) {
    this.estadoAtual = estadoAtual;
    estadoAtual.ajustarVidaPersonagem();
  }

  public boolean atacar(Personagem inimigo) {
    return estadoAtual.atacar(inimigo);
  }

  public boolean isVivo() {
    return vida >= 1;

  }

  public boolean perderVida(int dano) {
    vida -= dano;
    return vida <= 0;
  }

  public void ganharVida(int aumento) {
    vida += aumento;
  }

  @Override
  public String toString() {
    return "Vida = " + vida + "<br>" + estadoAtual.toString();
  }

}
