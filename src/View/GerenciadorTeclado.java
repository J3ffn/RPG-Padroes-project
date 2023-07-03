package View;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Model.GerenciadorPocoes;
import Model.Personagem;
import Model.Pocao;
import Ouvintes.OuvintePassosPersonagem;

public class GerenciadorTeclado implements KeyListener {

  private Personagem personagem;
  private PersonagemView personagemView;
  private OuvintePassosPersonagem ouvintePersonagem;
  private GerenciadorPocoes gerenciadorPocoes;
  private ZombieView zombie;

  public GerenciadorTeclado(PersonagemView p, GerenciadorPocoes gerenciadorPocoes, ZombieView zombieView) {
    personagemView = p;
    personagem = Personagem.getPersonagem();
    ouvintePersonagem = new OuvintePassosPersonagem(p);
    this.gerenciadorPocoes = gerenciadorPocoes;
    this.zombie = zombieView;
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
    if (x >= zombie.getX() - 20 && (y >= zombie.getY() - 40 && y <= zombie.getX() + 30) && zombie.isVivo()) {
        System.out.println("De frente com o zumbi");
        personagemView.setSprite("img/sprites/Player/atirar1.png");
        zombie.setSprite("img/sprites/Zombie/atacar.png");
        personagem.atacar(zombie.getZombie());
        Object object = new Object();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
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
