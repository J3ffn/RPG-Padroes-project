package States;

import Model.Personagem;

public class EstadoBase extends EstadoPersonagem{
	private float velocidade = 1;
    private int defesa = 0;
    private int ataque = 2;
    private int vidaMaxima = 10;
    
    public EstadoBase() {
    	velocidade = 1;
    	defesa = 0;
    	ataque = 2;
    	vidaMaxima = 10;
	}
}
