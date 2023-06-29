package Model;

import java.util.ArrayList;

public class GerenciadorCaminhos {
    
    private ArrayList<Elemento> caminhos = new ArrayList<Elemento>();

    private void CriarCaminhos(){
    	Elemento caminhoCasa = new Elemento(318, 338, 132, 226);
        caminhos.add(caminhoCasa);
        Elemento caminhoPracaPrincipal = new Elemento(270, 395, 200, 280);
        caminhos.add(caminhoPracaPrincipal);
    }

    public GerenciadorCaminhos(){
        CriarCaminhos();
    }

    public Boolean isFora(int x, int y){
        for (Elemento caminho : caminhos) {
            if (caminho.isDentro(x, y)){
                return false;
            }
        }
        return true;
    }
}
