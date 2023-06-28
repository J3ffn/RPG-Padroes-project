package States;

import Model.Personagem;

public abstract class EstadoPersonagem {

    private float velocidade;
    private int defesa;
    private int ataque;
    private int vidaMaxima;
    
    public float getVelocidade() {
		return velocidade;
	}

	public int getDefesa() {
		return defesa;
	}

	public int getAtaque() {
		return ataque;
	}
    public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}
	
	boolean atacar(Personagem inimigo) {

    	int defesaInimigo = inimigo.getEstadoAtual().getDefesa();
    	if (defesaInimigo >= getAtaque())
    		return false;
    	else {
			inimigo.perderVida(getAtaque());
			return true;
		}
    	
    }
    
}
