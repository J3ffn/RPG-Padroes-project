package src.Ouvintes;

import src.View.Personagem;
import src.View.TelaPrincipal;
import src.casas.Casa;
import src.casas.CasaBar;
import src.casas.CasaINN;
import src.casas.CasaMedico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OuvintePassosPersonagem implements KeyListener {

    private interface KeyFunction<T> {
        T execute();
    }

    private final JFrame tela;

    private Graphics graphics;

    private Personagem personagem;

    private int x = 200, y = 200;

    private Map<Integer, KeyFunction<String>> keys;

    private List<Casa> paredes = new ArrayList<>();

    public OuvintePassosPersonagem(Personagem personagem) {
        this.tela = TelaPrincipal.getJframe();
        graphics = tela.getGraphics();
        this.personagem = personagem;
        addKeys();
        addParedes();
    }

    private void addKeys() {
        keys = new HashMap<>();
        keys.put(KeyEvent.VK_LEFT, () -> {
            // Cima: x: 128, 214, y: 110
            // Direita: x: 214, y: 110, 172
            // Esquerda: x: 128, y: 110, 172
            // Baixo: x: 128, 214, y: 172
//            if (x == 220) return null;
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

    public void addParedes() {
        paredes.add(new CasaBar());
        paredes.add(new CasaMedico());
        paredes.add(new CasaINN());
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        // Cima: x: 128, 214, y: 110
        // Direita: x: 214, y: 110, 172
        // Esquerda: x: 128, y: 110, 172
        // Baixo: x: 128, 214, y: 172

        boolean paredeBaixo = (y + 10 == 100) && (x >= 130 && x <= 220);
        boolean paredeCima = (y - 10 == 130) && (x >= 120 && x <= 200);
        boolean paredeEsquerda = (y >= 110 && y <= 172) && x == 220;
        boolean paredeDireita = (y >= 90 && y <= 140) && x == 140;

        Integer keyPress = e.getKeyCode();
        String caminhoSprite = "";
//        if ((x >= 8 || y >= 30) && x <= 645 || y <= 474) {
//            if (x - 10 == 220) {
//                System.out.println("Entrou");
//            }

        if (paredeBaixo || paredeCima || paredeEsquerda || paredeDireita) System.out.println("Entrou");;
        System.out.println(x + " " + y);
        if (keys.containsKey(keyPress)) {
            caminhoSprite = keys.get(keyPress).execute();
            personagem.moveGraphics(x, y, caminhoSprite);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }


}
