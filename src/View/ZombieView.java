package View;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ZombieView extends Component {

	  private String caminhoSprite;
	  
	  public ZombieView(String caminho, int x, int y) {
		  this.setBounds(x, y, 15, 27);
		  caminhoSprite = caminho;
	  }
	  public ZombieView(int x, int y) {
		  this.setBounds(x, y, 15, 27);
		  caminhoSprite = "img/sprites/Zombie/Idle_Zombie_frente.png";
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
}
