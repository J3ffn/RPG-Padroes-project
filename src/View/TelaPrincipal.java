package View;

import java.util.ArrayList;

import javax.swing.*;

import Model.GerenciadorPocoes;
import Model.Zombie;

public class TelaPrincipal {

  private static JFrame jframe = null;
  private JLayeredPane layeredPane;

  public static JFrame getJframe() {
    return jframe;
  }

  private void setJFrame() {
    jframe = new JFrame();
    layeredPane = new JLayeredPane();
    jframe.setTitle("Demonstração STATE");
    jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

  private void adicionarMapa() {
    jframe.setContentPane(new Imagem());
  }

  private void setarParametrosTela() {
    jframe.setSize(698, 562);
    jframe.setResizable(false);
    jframe.setLocationRelativeTo(null);
  }

  public void iniciar() {
    setJFrame();
    setarParametrosTela();
    adicionarMundo();
    jframe.setVisible(true);
  }

  public void adicionarMundo() {
    adicionarMapa();
    addSprites();
  }

  public void addSprites() {
    PersonagemView p = new PersonagemView();
    layeredPane.add(p, JLayeredPane.PALETTE_LAYER);
    addPocoes(p);

    layeredPane.setFocusable(true);
    jframe.add(layeredPane);
  }

  public void setOuvinteLayer(GerenciadorTeclado gerenciadorTeclado) {
    layeredPane.addKeyListener(gerenciadorTeclado);
  }

  public void addPocoes(PersonagemView p) {
    GerenciadorPocoes gerenciadorPocoes = new GerenciadorPocoes();
    gerenciadorPocoes.getElementos().forEach(pocao -> {
      layeredPane.add(pocao, JLayeredPane.DEFAULT_LAYER);
    });
    adicionarInimigos(gerenciadorPocoes, p);
  }

  public void adicionarInimigos(GerenciadorPocoes gerenciadorPocoes, PersonagemView p) {
	ArrayList<ZombieView> zombies = new ArrayList<ZombieView>();  
    String lado = "img/sprites/Zombie/Idle_Zombie_lado_esquerdo.png";
    Zombie z1 = new Zombie();
    ZombieView zombieView = new ZombieView(z1, lado, 510, 255);
    layeredPane.add(zombieView, JLayeredPane.DEFAULT_LAYER);
    zombies.add(zombieView);

    lado = "img/sprites/Zombie/Idle_Zombie_lado_direito.png";
    ZombieView z2 = new ZombieView(new Zombie(), lado, 510, 146);
    jframe.add(z2);
    zombies.add(z2);

    z2 = new ZombieView(new Zombie(), lado, 520, 370);
    jframe.add(z2);
    zombies.add(z2);

    lado = "img/sprites/Zombie/Idle_Zombie_tipo_2.png";
    z2 = new ZombieView(new Zombie(), lado, 490, 370);
    jframe.add(z2);
    zombies.add(z2);
    
    z2 = new ZombieView(new Zombie(), lado, 470, 366);
    jframe.add(z2);
    zombies.add(z2);
    
    z2 = new ZombieView(new Zombie(), lado, 560, 310);
    jframe.add(z2);
    zombies.add(z2);
    
    z2 = new ZombieView(new Zombie(), lado, 450, 180);
    jframe.add(z2);
    zombies.add(z2);

    setOuvinteLayer(new GerenciadorTeclado(p, gerenciadorPocoes, zombies));
  }
}
