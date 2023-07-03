package View;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Model.Personagem;
import Model.Zombie;

public class ZombieView extends Component {

  private String caminhoSprite;
  private Zombie zumbi;

  public ZombieView(String caminho, int x, int y) {
    this.setBounds(x, y, 15, 50);
    caminhoSprite = caminho;
    zumbi = null;
  }

  public ZombieView(int x, int y) {
    this("img/sprites/Zombie/Idle_Zombie_frente.png", x, y);
  }

  public ZombieView(Zombie zombie, String caminho, int x, int y) {
    this(caminho, x, y);
    zumbi = zombie;
  }

  public void setSprite(String path) {
    caminhoSprite = path;
  }

  @Override
  public void paint(Graphics g) {

    BufferedImage image = null;
    try {
      image = ImageIO.read(new File(caminhoSprite));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    g.drawImage(image, 0, 0, 15, 27, null);
  }

  public boolean atacar(Personagem inimigo) {
    return (zumbi != null) ? zumbi.atacar(inimigo) : false;
  }

  public boolean perderVida(int dano) {
    return (zumbi != null) ? zumbi.perderVida(dano) : false;
  }

  public boolean isVivo() {
    return (zumbi != null) ? zumbi.isVivo() : false;
  }

  public Zombie getZombie() {
    return zumbi;
  }

}
