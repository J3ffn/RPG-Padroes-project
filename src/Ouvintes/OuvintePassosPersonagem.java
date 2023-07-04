package Ouvintes;

import Model.GerenciadorCaminhos;
import Model.Personagem;
import View.PersonagemView;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class OuvintePassosPersonagem {

  private interface KeyFunction<T> {
    T execute(float velocidade);
  }

  private PersonagemView personagemView;

  private Personagem personagem;

  private int x = 349, y = 275;

  private Map<Integer, KeyFunction<String>> keys;

  private GerenciadorCaminhos gerenciadorCaminhos;

  public OuvintePassosPersonagem(PersonagemView personagemView) {
    personagem = Personagem.getPersonagem();
    this.personagemView = personagemView;
    this.gerenciadorCaminhos = new GerenciadorCaminhos();
    addKeys();
  }

  private void addKeys() {
    keys = new HashMap<>();

    keys.put(KeyEvent.VK_LEFT, (tamanhoPasso) -> {
      if (gerenciadorCaminhos.isFora(x - tamanhoPasso, y) != null) {
        x -= tamanhoPasso;
        return "img/sprites/Player/andando/esquerda.png";
      }
      return null;
    });
    keys.put(KeyEvent.VK_RIGHT, (tamanhoPasso) -> {
      if (gerenciadorCaminhos.isFora(x + tamanhoPasso, y) != null) {
        x += tamanhoPasso;
        return "img/sprites/Player/andando/direita.png";
      }
      return null;
    });
    keys.put(KeyEvent.VK_UP, (tamanhoPasso) -> {
      if (gerenciadorCaminhos.isFora(x, y - tamanhoPasso) != null) {
        y -= tamanhoPasso;
        return "img/sprites/Player/andando/traseira.png";
      }
      return null;
    });
    keys.put(KeyEvent.VK_DOWN, (tamanhoPasso) -> {
      if (gerenciadorCaminhos.isFora(x, y + tamanhoPasso) != null) {
        y += tamanhoPasso;
        return "img/sprites/Player/andando/frente.png";
      }
      return null;
    });
  }

  public void keyPressed(KeyEvent e) {
    Integer keyPress = e.getKeyCode();
    String caminhoSprite = "";

    if (keys.containsKey(keyPress)) {
      caminhoSprite = keys.get(keyPress).execute(personagem.getEstadoAtual().getVelocidade());
      personagemView.moveGraphics(x, y, caminhoSprite);
    }
  }

}
