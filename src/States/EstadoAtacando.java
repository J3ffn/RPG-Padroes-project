package src.States;

import src.Interface.EstadoPersonagem;

public class EstadoAtacando implements EstadoPersonagem {

    @Override
    public void executarAcao() {
        System.out.println("O personagem está atacando.");
    }
}
