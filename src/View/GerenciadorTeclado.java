package View;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.Elemento;
import Model.GerenciadorPocoes;
import Model.Personagem;
import Model.Pocao;
import Ouvintes.OuvintePassosPersonagem;

public class GerenciadorTeclado implements KeyListener {

  
  private OuvintePassosPersonagem ouvintePersonagem;
  private GerenciadorPocoes gerenciadorPocoes;

  public GerenciadorTeclado(PersonagemView p, GerenciadorPocoes gerenciadorPocoes) {
    // personagemView = p;
    ouvintePersonagem = new OuvintePassosPersonagem(p);
    this.gerenciadorPocoes = gerenciadorPocoes;
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
    Pocao pocao = (Pocao) gerenciadorPocoes.isFora(x, y);
    if (pocao != null) {
      pocao.aplicarEfeitos(personagem);
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

}
