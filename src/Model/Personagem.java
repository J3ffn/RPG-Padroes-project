package Model;

import States.EstadoPersonagem;

public class Personagem {

  private EstadoPersonagem estadoAtual;
  private int vida;
  private final static Personagem personagem = new Personagem();

  public int getVida() {
    return vida;
  }

  public static Personagem getPersonagem() {
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
    int vidaMaximaAtual = getEstadoAtual().getVidaMaxima();
    if (getVida() > vidaMaximaAtual) {
      int diferenca = getVida() - vidaMaximaAtual;
      perderVida(diferenca);
    }
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

  public void ganharVida(int almento) {
    if (vida + almento > estadoAtual.getVidaMaxima())
      vida = estadoAtual.getVidaMaxima();
    else
      vida += almento;
  }

}
