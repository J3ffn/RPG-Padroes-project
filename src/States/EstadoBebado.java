package States;

import Interface.EstadoPersonagem;

public class EstadoBebado implements EstadoPersonagem{

	@Override
	public void executarAcao() {
		System.out.println("O personagem está bêbado.");
	}
	
	

}
