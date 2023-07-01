package Model;

import java.util.ArrayList;

public abstract class GerenciadorElementos{
    
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public abstract void CriarElementos();

    public GerenciadorElementos(){
        CriarElementos();
    }

    public Elemento isFora(int x, int y){
        for (Elemento elemento : elementos) if (elemento.isDentro(x, y)) return elemento;
        
        return null;
    }
}