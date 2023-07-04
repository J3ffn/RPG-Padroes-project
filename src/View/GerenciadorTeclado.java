package View;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import Model.GerenciadorPocoes;
import Model.Personagem;
import Model.Pocao;
import Ouvintes.OuvintePassosPersonagem;

public class GerenciadorTeclado implements KeyListener {

  private Personagem personagem;
  private PersonagemView personagemView;
  private OuvintePassosPersonagem ouvintePersonagem;
  private GerenciadorPocoes gerenciadorPocoes;
  private ArrayList<ZombieView> zombies;

  public GerenciadorTeclado(PersonagemView p, GerenciadorPocoes gerenciadorPocoes, ArrayList<ZombieView> zombieView) {
    personagemView = p;
    personagem = Personagem.getPersonagem();
    ouvintePersonagem = new OuvintePassosPersonagem(p);
    this.gerenciadorPocoes = gerenciadorPocoes;
    this.zombies = zombieView;
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (personagem.isVivo())
      ouvintePersonagem.keyPressed(e);

    Integer x = personagemView.getSpriteX();
    Integer y = personagemView.getSpriteY();
    Pocao pocao = (Pocao) gerenciadorPocoes.isFora(x, y);
    if (pocao != null && !pocao.getName().endsWith("vida")) {
      pocao.setVisible(false);
      pocao.setxCantoEsquerdo(0);
      pocao.setyCantoSuperior(0);
      pocao.setxCantoDireito(0);
      pocao.setyCantoInferior(0);
      pocao.aplicarEfeitos(personagem);
    }

    Integer ataquePersonagem = personagem.getEstadoAtual().getAtaque();
    Integer yPersonagem = personagemView.getSpriteY();
    Integer xPersonagem = personagemView.getSpriteX();
    ZombieView zombieMorto = null;
    for (ZombieView z : zombies) {
      Integer vidaZombie = z.getZumbi().getVida();
      Integer yZombie = z.getY();
      Integer xZombie = z.getX();
      if (z.isPerto(x, y) && z.isVivo()) {

        if (yPersonagem >= yZombie - 10 && yPersonagem <= yZombie + 10 && xPersonagem <= xZombie)
          personagemView.setSprite("img/sprites/Player/atacando/atirar1.png");
        else if (xPersonagem > xZombie)
          personagemView.setSprite("img/sprites/Player/atacando/atirarEsquerda.png");
        else if (yPersonagem < yZombie)
          personagemView.setSprite("img/sprites/Player/atacando/atirarBaixo.png");
        else if (yPersonagem > yZombie)
          personagemView.setSprite("img/sprites/Player/atacando/atirarCima.png");

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
          if (vidaZombie - ataquePersonagem <= 0)
            zombieMorto = z;
          else
            z.atacar(personagem);
          personagem.atacar(z.getZumbi());

        }
      }
    }
    if (zombieMorto != null) {
      zombieMorto.setSprite("img/sprites/Zombie/morto.png");
    }
    if (!personagem.isVivo())
      System.exit(0);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

}
