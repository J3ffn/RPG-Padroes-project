package src.Ouvintes;

import src.View.Personagem;
import src.View.TelaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class OuvintePassosPersonagem implements KeyListener {

    private interface KeyFunction<T> {
        T execute();
    }

    private final JFrame tela;
    private Graphics graphics;

    private Personagem personagem;

    private int x, y;

    private Map<Integer, KeyFunction<String>> keys;

    public OuvintePassosPersonagem(Personagem personagem) {
        this.tela = TelaPrincipal.getJframe();
        graphics = tela.getGraphics();
        this.personagem = personagem;
        addKeys();
    }

    private void addKeys() {
        keys = new HashMap<>();
        keys.put(KeyEvent.VK_LEFT, () -> {
            x -= 10;
            return "img/sprites/Player/esquerda.png";
        });
        keys.put(KeyEvent.VK_RIGHT, () -> {
            x += 10;
            return "img/sprites/Player/direita.png";
        });
        keys.put(KeyEvent.VK_UP, () -> {
            y -= 10;
            return "img/sprites/Player/traseira.png";
        });
        keys.put(KeyEvent.VK_DOWN, () -> {
            y += 10;
            return "img/sprites/Player/frente.png";
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

        Integer keyPress = e.getKeyCode();
        String caminhoSprite = "";
//        if ((x >= 8 || y >= 30) && x <= 645 || y <= 474) {
        if (keys.containsKey(keyPress)) {
            caminhoSprite = keys.get(keyPress).execute();
            personagem.moveGraphics(x, y, caminhoSprite);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
