package States;

import Interface.EstadoPersonagem;

public class EstadoCorrendo implements EstadoPersonagem {

    @Override
    public void executarAcao() {
        System.out.println("O personagem está correndo.");
    }
}
