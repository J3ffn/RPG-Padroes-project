package States;

import Model.Personagem;

import java.util.Random;

public class EstadoBebado extends EstadoPersonagem {
  public EstadoBebado() {
    setVelocidade(1);
    setDefesa(10);
    setAtaque(2);
    setVidaMaxima(20);
  }

  @Override
  public boolean atacar(Personagem inimigo) {
    Random random = new Random();
    int numero = random.nextInt(7);
    System.out.println(numero);

    return (numero % 2 != 0) ? super.atacar(inimigo) : false;
    /*
     * if (numero % 2 != 0) {
     * 
     * int defesaInimigo = inimigo.getEstadoAtual().getDefesa();
     * if (defesaInimigo >= getAtaque()){
     * return false;
     * } else {
     * inimigo.perderVida(getAtaque());
     * return true;
     * }
     * }
     * return false;
     */

  }
}
