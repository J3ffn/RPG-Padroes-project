package Model;

public class GerenciadorPocoes extends GerenciadorElementos {

  @Override
  public void CriarElementos() {
    Pocao pocaoVida = new Pocao(153, 171, 173, 189);
    pocaoVida.setNome("Poçao de vida");
    pocaoVida.setDescricao(
        "Uma poção brilhante e revitalizante que restaura instantaneamente a vitalidade do consumidor. Seus tons dourados emanam um aroma suave de ervas curativas, promovendo uma cura rápida e eficaz. Beba desta poção para sentir a energia da vida fluir por suas veias.");
    getElementos().add(pocaoVida);
  }

}
