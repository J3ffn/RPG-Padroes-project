package Model;

import java.awt.Component;

public class Elemento extends Component {
  private int xCantoEsquerdo;
  private int yCantoSuperior;

  private int xCantoDireito;
  private int yCantoInferior;

  public Elemento(int xEsquerdo, int yCima, String name) {
    xCantoEsquerdo = xEsquerdo - 5;
    yCantoSuperior = yCima;
    setName(name);
    setArea();
  }

  public Elemento(int xCantoEsquerdo, int xCantoDireito, int yCantoSuperior, int yCantoInferior) {
    this.xCantoEsquerdo = xCantoEsquerdo;
    this.xCantoDireito = xCantoDireito;
    this.yCantoSuperior = yCantoSuperior;
    this.yCantoInferior = yCantoInferior;
  }

  public boolean isDentro(float x, float y) {
    if (xCantoEsquerdo < x && xCantoDireito > x) {
      if (yCantoSuperior < y && yCantoInferior > y) {
        return true;
      }
    }
    return false;
  }

  public int getxCantoEsquerdo() {
    return xCantoEsquerdo;
  }

  public void setxCantoEsquerdo(int xCantoEsquerdo) {
    this.xCantoEsquerdo = xCantoEsquerdo;
  }

  public int getyCantoSuperior() {
    return yCantoSuperior;
  }

  public void setyCantoSuperior(int yCantoSuperior) {
    this.yCantoSuperior = yCantoSuperior;
  }

  public int getxCantoDireito() {
    return xCantoDireito;
  }

  public void setxCantoDireito(int xCantoDireito) {
    this.xCantoDireito = xCantoDireito;
  }

  public int getyCantoInferior() {
    return yCantoInferior;
  }

  public void setyCantoInferior(int yCantoInferior) {
    this.yCantoInferior = yCantoInferior;
  }

  private void setArea() {
    if (getName().equalsIgnoreCase("Leite")) {
      yCantoInferior = yCantoSuperior + 5;
      xCantoEsquerdo -= 15;
      xCantoDireito = xCantoEsquerdo + 20;
    } else {
      xCantoDireito = xCantoEsquerdo + 10;
      yCantoInferior = yCantoSuperior + 13;
    }

  }

}
