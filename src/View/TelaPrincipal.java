package src.View;

import src.Ouvintes.KeyOuvinte;
import src.Ouvintes.OuvintePassosPersonagem;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ComponentListener;
import java.io.File;

public class TelaPrincipal {

    private static final JFrame jframe = new JFrame();

    private String caminhoSprite;

    public TelaPrincipal() {
        jframe.setTitle("Demonstração STATE");
        setarParametrosTela();
        adicionarBackground();
    }

    public static JFrame getJframe() {
        return jframe;
    }

    private void adicionarBackground() {
        jframe.setContentPane(new Imagem());
    }

    private void setarParametrosTela() {
        jframe.setSize(698, 562);
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.setVisible(true);
    }

    public void iniciar() {
        addSprite();
        jframe.setVisible(true);
    }

    public void addSprite() {
        Personagem p = new Personagem();
        jframe.add(p);
        jframe.addKeyListener(new OuvintePassosPersonagem(p));
    }

}
