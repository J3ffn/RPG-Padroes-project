package Ouvintes;

import View.Personagem;
import View.TelaPrincipal;

import Model.Caminho;
import Model.GerenciadorCaminhos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class OuvintePassosPersonagem implements KeyListener {

    private interface KeyFunction<T> {
        T execute();
    }

    private final JFrame tela;
    private Graphics graphics;

    private Personagem personagem;

    private int x = 349, y = 275;

    private Map<Integer, KeyFunction<String>> keys;

    private GerenciadorCaminhos gerenciadorCaminhos = new GerenciadorCaminhos();
    

    public OuvintePassosPersonagem(Personagem personagem) {
        this.tela = TelaPrincipal.getJframe();
        graphics = tela.getGraphics();
        this.personagem = personagem;
        addKeys();
    }

    private void addKeys() {

        
            keys = new HashMap<>();
            keys.put(KeyEvent.VK_LEFT, () -> {
                if (!gerenciadorCaminhos.isFora(x - 10, y)){
                    x -= 10;
                    return "img/sprites/Player/esquerda.png";
                }
                return null;
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
