package Model;

import States.EstadoBebado;

public class PocaoHidromel extends Pocao {

    public PocaoHidromel(int xEsquerdo, int yCima, String caminho) {
        super(xEsquerdo, yCima, caminho);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void aplicarEfeitos(Personagem personagem) {
            personagem.setEstadoAtual(new EstadoBebado());
    }
    
}
