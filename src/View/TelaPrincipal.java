package View;

import Ouvintes.OuvintePassosPersonagem;

import javax.swing.*;

public class TelaPrincipal {

    private static JFrame jframe = null;

    private String caminhoSprite;

    public TelaPrincipal() {
        jframe = new JFrame();
        jframe.setTitle("Demonstração STATE");
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
    }

    public void iniciar() {
        addSprite();
        jframe.setVisible(true);
    }

    public void addSprite() {
        PersonagemView p = new PersonagemView();
        jframe.add(p);
        jframe.addKeyListener(new OuvintePassosPersonagem(p));
    }
    
}
