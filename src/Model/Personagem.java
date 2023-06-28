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
	}
    public void executarAcao() {
		// TODO Auto-generated method stub

	}
    public void perderVida(int dano) {
		// TODO Auto-generated method stub

	}
    
}
