package View;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
    if (zombie.isPerto(x, y) && zombie.isVivo()) {
    	System.out.println("De frente com o zumbi - Hoje às 00:30");
    	
    	int sprite = 1;
    	if(sprite == 4) {
    		sprite = 1;
    	}
    	personagemView.setSprite("img/sprites/Player/atirar"+ sprite +".png");
    	personagem.atacar(zombie.getZumbi());
    	try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	zombie.setSprite("img/sprites/Zombie/atacar.png");
    	zombie.atacar(personagem);
    	
    	if(!zombie.isVivo()) {
    		zombie.setSprite("img/sprites/Zombie/morto.png");
    	}
    	
    	sprite++;
    }
  }
  
  
  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }
  
  

}
