package src.Ouvintes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyOuvinte implements KeyListener {

    private JFrame tela;
    private Graphics graphics;
    private int x, y;

    public KeyOuvinte(JFrame tela, int x, int y) {
        this.tela = tela;
        graphics = tela.getGraphics();
        this.y = y;
        this.x = x;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

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
//            tela.paint(x, y, caminhoSprite);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
