package View;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Model.Elemento;

public class OuvintePocao implements KeyListener {

  private PersonagemView personagem;

  public OuvintePocao(PersonagemView personagemView) {

    // System.out.println("ADicionou");
    this.personagem = personagemView;
    // pocoes = gerenciadorPocoes.getElementos();
  }

  // public boolean emCima(int x, int y) {
  // boolean porCima = false;
  // for (Elemento p : pocoes) {
  // if (p.getX() == x && p.getY() == y) {
  // porCima = true;
  // if (p.isVisible())
  // hidden(p);
  // }
  // }
  // return porCima;
  // }

  public void hidden(Elemento elemento) {
    elemento.setVisible(false);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    System.out.println("foi tambem");
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    System.out.println("foi tambem");
    // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("foi tambem");
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method
    // 'keyReleased'");
  }

}
