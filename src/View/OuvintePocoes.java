package View;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

import Model.Elemento;
import Model.GerenciadorPocoes;

public class OuvintePocoes extends ComponentAdapter {

  private ArrayList<Elemento> pocoes;

  public OuvintePocoes() {
    this.pocoes = new GerenciadorPocoes().getElementos();
  }

  public boolean emCima(int x, int y) {
    boolean porCima = false;
    for (Elemento p : pocoes) {
      if (p.getX() == x && p.getY() == y) {
        porCima = true;
      }
    }
    return porCima;
  }

  @Override
  public void componentHidden(ComponentEvent e) {
    super.componentHidden(e);
  }
}
