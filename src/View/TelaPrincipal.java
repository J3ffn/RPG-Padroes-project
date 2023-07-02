package View;

import javax.swing.*;

import Model.GerenciadorPocoes;

public class TelaPrincipal {

  private static JFrame jframe = null;
  private JLayeredPane layeredPane;

  public TelaPrincipal() {
    jframe = new JFrame();
    layeredPane = new JLayeredPane();
    jframe.setTitle("Demonstração STATE");
    jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setarParametrosTela();
    adicionarBackground();
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
    layeredPane.add(p, JLayeredPane.PALETTE_LAYER);
    addPocoes(p);
    // jframe.addKeyListener(new OuvintePassosPersonagem(p));

    layeredPane.setFocusable(true);
    jframe.add(layeredPane);
  }

  public void addPocoes(PersonagemView p) {
    GerenciadorPocoes gerenciadorPocoes = new GerenciadorPocoes();
    gerenciadorPocoes.getElementos().forEach(pocao -> {
      System.out.println(pocao.getX());
      layeredPane.add(pocao, JLayeredPane.DEFAULT_LAYER);
    });
    layeredPane.addKeyListener(new GerenciadorTeclado(p, gerenciadorPocoes));
  }
}
