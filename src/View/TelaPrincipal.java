package View;

import Ouvintes.OuvintePassosPersonagem;

import javax.swing.*;

import Model.Pocao;
import Model.Zombie;

public class TelaPrincipal {

  private static JFrame jframe = null;

  public TelaPrincipal() {
    jframe = new JFrame();
    jframe.setTitle("Demonstração STATE");
    jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setarParametrosTela();
    adicionarBackground();
    adicionarPocoes();
    adicionarInimigos();
    addSprite();
  }

  public static JFrame getJframe() {
    return jframe;
  }

  private void adicionarBackground() {
    jframe.setContentPane(new Imagem());
  }

  private void setarParametrosTela() {
    jframe.setSize(698, 562);
    jframe.setResizable(false);
    jframe.setLocationRelativeTo(null);
  }

  public void iniciar() {
    jframe.setVisible(true);
  }

  public void addSprite() {
    PersonagemView p = new PersonagemView();
    jframe.add(p);
    jframe.addKeyListener(new OuvintePassosPersonagem(p));
  }

  public void adicionarPocoes() {
    Pocao pocaoHidromel = new Pocao(152, 173, "img/pocoes/hidromel.png");
    Pocao pocaoCura = new Pocao(216, 370, "img/pocoes/cura.png");
    Pocao pocaoVelocidade = new Pocao(323, 152, "img/pocoes/velocidade.png");
    // Pocao pocao = new Pocao(153, 173, "img/pocoes/furia.png");
    jframe.add(pocaoHidromel);
    jframe.add(pocaoCura);
    jframe.add(pocaoVelocidade);
  }
  public void adicionarInimigos() {
	 String lado = "img/sprites/Zombie/Idle_Zombie_lado_esquerdo.png";
	 jframe.add(new ZombieView(lado, 510, 255));
	 
	 lado = "img/sprites/Zombie/Idle_Zombie_lado_direito.png";
	 jframe.add(new ZombieView(lado, 510, 146));
	 jframe.add(new ZombieView(lado, 520, 370));
	 
	 lado = "img/sprites/Zombie/Idle_Zombie_tipo_2.png";
	 jframe.add(new ZombieView(lado,490, 370));
	 jframe.add(new ZombieView(lado,470, 366));
	 jframe.add(new ZombieView(lado,560, 153));
	 jframe.add(new ZombieView(lado, 560, 210));
	 
	 jframe.add(new ZombieView(560, 310));
	 jframe.add(new ZombieView(450, 180));
  }
}
