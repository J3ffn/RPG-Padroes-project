package Model;

import java.util.ArrayList;

public abstract class GerenciadorElementos {

  protected static ArrayList<Elemento> elementos;

  public GerenciadorElementos() {
    elementos = new ArrayList<Elemento>();
    CriarElementos();
  }

  public abstract void CriarElementos();

  public ArrayList<Elemento> getElementos() {
    return elementos;
  }

  public Boolean isFora(int x, int y) {
    for (Elemento elemento : elementos) {
      if (elemento.isDentro(x, y)) {
        return false;
      }
    }
    return true;
  }
}