package View;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.Pocao;
import Ouvintes.OuvintePassosPersonagem;

public class GerenciadorTeclado implements KeyListener {

  private PersonagemView personagem;
  private OuvintePassosPersonagem ouvintePersonagem;
  List<Pocao> pocoes;

  public GerenciadorTeclado(PersonagemView p, Component[] components) {
    personagem = p;
    ouvintePersonagem = new OuvintePassosPersonagem(p);
    addPocoes(components);
  }

  private void addPocoes(Component[] components) {
    pocoes = new ArrayList<>();
    for (Component c : components) {
      if (c.getName() != null && c.getName().startsWith("Poção")) {
        pocoes.add((Pocao) c);
      }
    }
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
    pocoes.forEach(p -> {
      Integer xEsq = p.getxCantoEsquerdo();
      Integer xDir = p.getxCantoDireito();
      // if () { // TODO Refazer alogica dessa condição e adicionar o efeito de cada
      // estado no personagem em cima da poção
      System.out.println("Está no meio");

      // }
    });
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

}
