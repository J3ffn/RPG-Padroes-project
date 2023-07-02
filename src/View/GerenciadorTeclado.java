package View;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.List;

import Ouvintes.OuvintePassosPersonagem;

public class GerenciadorTeclado implements KeyListener {

  private PersonagemView personagem;
  private OuvintePassosPersonagem ouvintePersonagem;
  List<Component> components;

  public GerenciadorTeclado(PersonagemView p, Component[] components) {
    personagem = p;
    this.components = Arrays.asList(components);
    ouvintePersonagem = new OuvintePassosPersonagem(p);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    System.out.println("foi tambem");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    ouvintePersonagem.keyPressed(e);

    Integer x = personagem.getSpriteX();
    Integer y = personagem.getSpriteY();
    components.forEach(p -> {
      Integer tamP = p.getWidth();
      if (x >= p.getX() && x <= p.getX() + tamP) {  // TODO Refazer alogica dessa condição e adicionar o efeito de cada estado no personagem em cima da poção
        System.out.println("Está no meio");

      }
    });
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

}
