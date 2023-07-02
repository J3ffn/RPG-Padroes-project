package Model;

import States.EstadoFlash;

public class PocaoVelocidade extends Pocao {

    public PocaoVelocidade(int xEsquerdo, int yCima, String caminho) {
        super(xEsquerdo, yCima, caminho);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void aplicarEfeitos(Personagem personagem) {
        personagem.setEstadoAtual(new EstadoFlash());
    }
    
}
