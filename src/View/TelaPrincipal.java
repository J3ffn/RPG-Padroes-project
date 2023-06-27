package View;

import Ouvintes.KeyOuvinte;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TelaPrincipal extends JFrame {

    private int x = 645, y = 474;

    public TelaPrincipal() {
        setTitle("Demonstração STATE");
        setarParametrosTela();
//        getContentPane().setBackground(Color.BLACK);
        this.setBackground(null);

    }

    private void setarParametrosTela() {
        setSize(698, 562);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void iniciar() {
        setVisible(true);
        addSprite();
        this.addKeyListener(new KeyOuvinte(this, x, y));
    }

    public void addSprite() {
        Graphics g = this.getGraphics();
//        g.drawImage(createImage(100, 100), 200, 200, Color.BLUE,this);
//        g.create(100, 100, 200, 200);
//        g.setColor(Color.BLUE);

    }

    private String caminhoSprite;

    public void moveGraphics(int newX, int newY, String caminhoSprite) {
        x = newX;
        y = newY;
        this.caminhoSprite = caminhoSprite;
        repaint();
    }

    @Override
    public void paint(Graphics g){
        g.clearRect(x - 10, y - 10, 100, 110);
        if (caminhoSprite == null) caminhoSprite = "img/sprites/Player/frente.png";
//        File path = new File();
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(caminhoSprite));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        super.paint(image.getGraphics());

        g.drawImage(image, x, y, 45, 81, null);
    }

}
