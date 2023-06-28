package src.States;

import src.Interface.EstadoPersonagem;

public class EstadoAndando implements EstadoPersonagem{

    @Override
    public void executarAcao() {
        System.out.println("O personagem está andando.");
        // Lógica para a ação específica de andar
    }
}
