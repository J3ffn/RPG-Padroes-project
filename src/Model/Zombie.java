package Model;

import States.EstadoBase;

public class Zombie extends Personagem {
  public Zombie() {
    this.setVida(7);
    this.setEstadoAtual(new EstadoBase());
  }
}
