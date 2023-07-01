package States;

import java.util.Random;

import States.EstadoPersonagem;

public class EstadoBebado extends EstadoPersonagem {
	public EstadoBebado() {
		setVelocidade(0.5f);
		setDefesa(10);
		setAtaque(2);
		setVidaMaxima(20);
	}

	@Override
	public
	boolean atacar(Model.Personagem inimigo) {
		Random random = new Random();
		int numero = random.nextInt(11);

		return (numero % 2 != 0) ? super.atacar(inimigo) : false;
		/*
		 * if (numero % 2 != 0) {
		 * 
			 * int defesaInimigo = inimigo.getEstadoAtual().getDefesa();
			 * if (defesaInimigo >= getAtaque()){ 
			 * 	return false; 
			 * } else { 
			 * 	inimigo.perderVida(getAtaque());
			 * 	return true; 
			 * }
		 * } 
		 * return false;
		 */

	}
}
