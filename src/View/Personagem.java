package View;

import Ouvintes.OuvintePassosPersonagem;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class Personagem extends Component {

    private String caminhoSprite;
    private int x = 349, y = 275;

    public Personagem() {
        TelaPrincipal.getJframe().getContentPane().addKeyListener(new OuvintePassosPersonagem(this));
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
//        g.clearRect(x - 10, y - 10, 60, 60);
        if (caminhoSprite == null) caminhoSprite = "img/sprites/Player/frente.png";
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(caminhoSprite));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        super.paint(image.getGraphics());

        g.drawImage(image, x, y, 15, 27, new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return false;
            }
        });
    }

}
