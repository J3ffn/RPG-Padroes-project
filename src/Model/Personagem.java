package Model;

import States.EstadoBase;
import States.EstadoPersonagem;

public abstract class Personagem {
    private EstadoPersonagem estadoAtual;
    private int vida;
    
	public int getVida() {
		return vida;
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
			int diferença = getVida() - vidaMaximaAtual;
			perderVida(diferença);
		}
	}
    public void executarAcao() {
		// TODO Auto-generated method stub

	}
    
    public boolean isVivo() {
		if (vida <= 0) {
			return false;
		}
		return true;

	}
    public void perderVida(int dano) {
    	vida -= dano;
	}
    
}
