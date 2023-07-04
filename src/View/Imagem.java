package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Imagem extends JPanel {

  private Image image;

  public Imagem() {
    this.initialize();
  }

  protected void initialize() {
    try {
      this.image = this.getImage("./img/background/Leowood.png");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    this.setLayout(new BorderLayout());
  }

  public Image getImage(String path) throws IOException {
    return ImageIO.read(new File(path));
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Dimension dDesktop = this.getSize();

    double width = dDesktop.getWidth();
    double height = dDesktop.getHeight();

    Image background = new ImageIcon(this.image.getScaledInstance(
        (int) width, (int) height, 1)).getImage();

    g.drawImage(background, 0, 0, this);
  }
}
