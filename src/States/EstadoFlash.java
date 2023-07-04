package States;

import Model.Personagem;

public class EstadoFlash extends EstadoPersonagem {

  public EstadoFlash() {
    aumentarVelocidade(8);
    aumentarDefesa();
    setAtaque(2);
    setVidaMaxima(20);
  }
  

  public void aumentarDefesa() {
    int novaDefesa = (int) (getDefesa() * (getVelocidade() / 3));
    setDefesa(novaDefesa);
  }

  public void aumentarVelocidade(int valor) {
    setVelocidade(valor);
  }

  public boolean atacar(Personagem inimigo) {
    int defesaInimigo = inimigo.getEstadoAtual().getDefesa();
    boolean isSucesso = true;
    for (int i = 0; i < getVelocidade(); i++) {
      if (defesaInimigo >= getAtaque()) {
        isSucesso = false;
        break;
      } else {
        inimigo.perderVida(getAtaque());
      }
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    return isSucesso;
  }
}
