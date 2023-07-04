package Model;

import States.EstadoFlash;

public class PocaoVelocidade extends Pocao {

    public PocaoVelocidade(int xEsquerdo, int yCima, String caminho) {
        super(xEsquerdo, yCima, caminho, "Velocidade");
    }

    @Override
    public void aplicarEfeitos(Personagem personagem) {
        personagem.setEstadoAtual(new EstadoFlash());
    }
    
}
