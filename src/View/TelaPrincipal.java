package View;

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
    String lado = "img/sprites/Zombie/Idle_Zombie_lado_esquerdo.png";
    ZombieView zombieView = new ZombieView(new Zombie(), lado, 510, 255);
    layeredPane.add(zombieView, JLayeredPane.DEFAULT_LAYER);
    setOuvinteLayer(new GerenciadorTeclado(p, gerenciadorPocoes, zombieView));

    lado = "img/sprites/Zombie/Idle_Zombie_lado_direito.png";
    jframe.add(new ZombieView(lado, 510, 146));
    jframe.add(new ZombieView(lado, 520, 370));

    lado = "img/sprites/Zombie/Idle_Zombie_tipo_2.png";
    jframe.add(new ZombieView(lado, 490, 370));
    jframe.add(new ZombieView(lado, 470, 366));
    jframe.add(new ZombieView(lado, 560, 153));
    jframe.add(new ZombieView(lado, 560, 210));

    jframe.add(new ZombieView(560, 310));
    jframe.add(new ZombieView(450, 180));
  }
}
