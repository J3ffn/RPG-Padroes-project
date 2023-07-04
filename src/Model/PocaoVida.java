package Model;

public class PocaoVida extends Pocao {

  public PocaoVida(int xEsquerdo, int yCima, String caminho) {
    super(xEsquerdo, yCima, caminho, "Vida");
  }

  @Override
  public void aplicarEfeitos(Personagem personagem) {
    if (personagem.getVida() < 10)
      personagem.ganharVida(10);
  }

}
