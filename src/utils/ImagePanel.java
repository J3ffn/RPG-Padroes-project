package utils;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JComponent {

  private Image imagem;

  public ImagePanel(Image imagem) {
    this.imagem = imagem;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(imagem, 0, 0, this);
  }

}
