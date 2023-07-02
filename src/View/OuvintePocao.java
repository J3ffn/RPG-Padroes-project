package View;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Model.Elemento;

public class OuvintePocao implements KeyListener {

  private PersonagemView personagem;

  public OuvintePocao(PersonagemView personagemView) {
    this.personagem = personagemView;
  }

  public void hidden(Elemento elemento) {
    elemento.setVisible(false);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    System.out.println("foi tambem");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    System.out.println("foi tambem");
  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println("foi tambem");
  }

}
