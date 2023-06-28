package Model;

import java.util.ArrayList;

public class GerenciadorCaminhos {
    
    private ArrayList<Caminho> caminhos = new ArrayList<Caminho>();

    private void CriarCaminhos(){
        Caminho caminhoCasa = new Caminho(485, 507, 224, 319);
        caminhos.add(caminhoCasa);
        Caminho caminhoPracaPrincipal = new Caminho(420, 604, 320, 446);
        caminhos.add(caminhoPracaPrincipal);
    }

    public GerenciadorCaminhos(){
        CriarCaminhos();
    }

    public Boolean isFora(int x, int y){
        for (Caminho caminho : caminhos) {
            if (caminho.isDentro(x, y)){
                return false;
            }
        }
        return true;
    }
}
