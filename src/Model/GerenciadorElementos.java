package Model;

import java.util.ArrayList;

public abstract class GerenciadorElementos {

  protected ArrayList<Elemento> elementos = new ArrayList<Elemento>();

  public GerenciadorElementos() {
    CriarElementos();
  }

  public ArrayList<Elemento> getElementos() {
    return elementos;
  }

  public abstract void CriarElementos();

  public Elemento isFora(float x, float y) {
    for (Elemento elemento : elementos)
      if (elemento.isDentro(x, y))
        return elemento;

    return null;
  }
}