package Model;

import States.EstadoBase;

public class Zombie extends Personagem{
	public Zombie() {
		this.setEstadoAtual(new EstadoBase());
	}
}
