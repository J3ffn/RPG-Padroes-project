package src;

import src.Model.Personagem;
import src.States.EstadoAtacando;
import src.States.EstadoCorrendo;
import src.View.TelaPrincipal;

public class Main {

    public static void main(String[] args) {
        // Criação do personagem
        Personagem personagem = new Personagem();

        // Teste com o estado Andando
        personagem.executarAcao();

        // Altera o estado para Correndo
        personagem.setEstado(new EstadoCorrendo());

        // Teste com o estado Correndo
        personagem.executarAcao();

        // Altera o estado para Atacando
        personagem.setEstado(new EstadoAtacando());

        // Teste com o estado Atacando
        personagem.executarAcao();

        TelaPrincipal tela = new TelaPrincipal();
        tela.iniciar();
    }
}