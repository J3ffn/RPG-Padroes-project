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
    ouvintePersonagem.keyPressed(e);

    Integer x = personagemView.getSpriteX();
    Integer y = personagemView.getSpriteY();
    Pocao pocao = (Pocao) gerenciadorPocoes.isFora(x, y);
    if (pocao != null) {
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
            z.setSprite("img/sprites/Zombie/morto.png");
          personagem.atacar(z.getZumbi());
        }

        // System.out.println("De frente com o zumbi, ataque!");

        // int sprite = 1;
        // if(sprite == 4) {
        // sprite = 1;
        // }
        // personagemView.setSprite("img/sprites/Player/atirar"+ sprite +".png");
        // boolean atacou = personagem.atacar(z.getZumbi());
        // if(!atacou)
        // System.out.println("Errou o ataque");
        // try {
        // TimeUnit.SECONDS.sleep(1);
        // } catch (InterruptedException e1) {
        // e1.printStackTrace();
        // }

        // z.setSprite("img/sprites/Zombie/atacar.png");
        // z.atacar(personagem);

        // if(!z.isVivo()) {
        // z.setSprite("img/sprites/Zombie/morto.png");
        // }

        // sprite++;
      }
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

}
