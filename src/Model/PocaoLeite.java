package Model;

import States.EstadoBase;

public class PocaoLeite extends Pocao {

  public PocaoLeite(int xEsquerdo, int yCima, String caminho) {
    super(xEsquerdo, yCima + 12, caminho, "Leite");
  }

  @Override
  public void aplicarEfeitos(Personagem personagem) {
    personagem.setEstadoAtual(new EstadoBase());
  }

}
