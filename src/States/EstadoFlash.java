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
    boolean isSucesso = true;
    inimigo.perderVida(getAtaque());
    return isSucesso;
  }
}
