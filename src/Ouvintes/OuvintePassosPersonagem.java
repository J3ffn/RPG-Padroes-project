package Ouvintes;

import Model.GerenciadorCaminhos;
import View.PersonagemView;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class OuvintePassosPersonagem implements KeyListener {

  private interface KeyFunction<T> {
    T execute();
  }

  private PersonagemView personagemView;

  private int x = 349, y = 275;

  private Map<Integer, KeyFunction<String>> keys;

  private GerenciadorCaminhos gerenciadorCaminhos = new GerenciadorCaminhos();

  public OuvintePassosPersonagem(PersonagemView personagemView) {
    this.personagemView = personagemView;
    addKeys();
  }

  private void addKeys() {
    int tamanhoPasso = 2;

    keys = new HashMap<>();
    keys.put(KeyEvent.VK_LEFT, () -> {
      if (!gerenciadorCaminhos.isFora(x - tamanhoPasso, y)) {
        x -= tamanhoPasso;
        return "img/sprites/Player/esquerda.png";
      }
      return null;
    });
    keys.put(KeyEvent.VK_RIGHT, () -> {
      if (!gerenciadorCaminhos.isFora(x + tamanhoPasso, y)) {
        x += tamanhoPasso;
        return "img/sprites/Player/direita.png";
      }
      return null;
    });
    keys.put(KeyEvent.VK_UP, () -> {
      if (!gerenciadorCaminhos.isFora(x, y - tamanhoPasso)) {
        y -= tamanhoPasso;
        return "img/sprites/Player/traseira.png";
      }
      return null;
    });
    keys.put(KeyEvent.VK_DOWN, () -> {
      if (!gerenciadorCaminhos.isFora(x, y + tamanhoPasso)) {
        y += tamanhoPasso;
        return "img/sprites/Player/frente.png";
      }
      return null;
    });
  }

  @Override
  public void keyPressed(KeyEvent e) {
    Integer keyPress = e.getKeyCode();
    String caminhoSprite = "";

    if (keys.containsKey(keyPress)) {
      caminhoSprite = keys.get(keyPress).execute();
      personagemView.moveGraphics(x, y, caminhoSprite);
    }

  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

}
