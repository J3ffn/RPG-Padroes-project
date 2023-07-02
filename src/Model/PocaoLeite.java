package Model;

import States.EstadoBase;

public class PocaoLeite extends Pocao {

    public PocaoLeite(int xEsquerdo, int yCima, String caminho) {
        super(xEsquerdo, yCima, caminho);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void aplicarEfeitos(Personagem personagem) {
        personagem.setEstadoAtual(new EstadoBase());
    }
    
}
