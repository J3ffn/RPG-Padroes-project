package View;

import Ouvintes.OuvintePassosPersonagem;

import javax.swing.*;

import Model.Pocao;

public class TelaPrincipal {

  private static JFrame jframe = null;

  private String caminhoSprite;

  public TelaPrincipal() {
    jframe = new JFrame();
    jframe.setTitle("Demonstração STATE");
    jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setarParametrosTela();
    adicionarBackground();
    adicionarPocoes();
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
}
