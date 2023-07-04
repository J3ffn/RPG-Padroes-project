package States;

import Model.Personagem;

import java.util.Random;

public class EstadoBebado extends EstadoPersonagem {
	int cont = 1;
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
    
    if(numero % 2 != 0){
    	return super.atacar(inimigo);
    }
    
    if(cont == 3) {
		personagem.setEstadoAtual(new EstadoFuria());
	}
    
    cont++;
    return false;
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
