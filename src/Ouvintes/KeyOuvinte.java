package Ouvintes;

import View.TelaPrincipal;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class KeyOuvinte implements KeyListener {

    private TelaPrincipal tela;
    private Graphics graphics;
    private int x, y;

    public KeyOuvinte(TelaPrincipal tela, int x, int y) {
        this.tela = tela;
        graphics = tela.getGraphics();
        this.y = y;
        this.x = x;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        String caminhoSprite = "";
        if ((x >= 8 || y >= 30) && x <= 645 || y <= 474) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    caminhoSprite = "img/sprites/Player/esquerda.png";
                    x -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    caminhoSprite = "img/sprites/Player/direita.png";
                    x += 10;
                    break;
                case KeyEvent.VK_DOWN:
                    caminhoSprite = "img/sprites/Player/frente.png";
                    y += 10;
                    break;
                case KeyEvent.VK_UP:
                    caminhoSprite = "img/sprites/Player/traseira.png";
                    y -= 10;
                    break;
            }
            if(caminhoSprite != "")
            	tela.moveGraphics(x, y, caminhoSprite);
        }

//        BufferedImage image = null;
//        try {
//            image = ImageIO.read(new File(caminhoSprite));
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//        graphics.drawImage(image, x, y, 45, 81, null);

    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
