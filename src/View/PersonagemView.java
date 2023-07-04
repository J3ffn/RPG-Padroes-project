package View;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PersonagemView extends Component {

  private String caminhoSprite;
  private int x = 349, y = 275;

  public PersonagemView() {
    setBounds(0, 0, 698, 562);
  }

  public void setSprite(String path) {
    caminhoSprite = path;
  }

  public void moveGraphics(int newX, int newY, String caminhoSprite) {
    x = newX;
    y = newY;
    this.caminhoSprite = caminhoSprite;
    repaint();
  }

  @Override
  public void paint(Graphics g) {
    if (caminhoSprite == null)
      caminhoSprite = "img/sprites/Player/andando/frente.png";

    BufferedImage image = null;
    try {
      image = ImageIO.read(new File(caminhoSprite));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    g.drawImage(image, x, y, 20, 27, null);
  }

  public int getSpriteX() {
    return x;
  }

  public int getSpriteY() {
    return y;
  }
}
