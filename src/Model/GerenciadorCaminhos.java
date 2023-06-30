package Model;

import java.util.ArrayList;

public class GerenciadorCaminhos {
    
    private ArrayList<Elemento> caminhos = new ArrayList<Elemento>();

    private void CriarCaminhos(){
    	Elemento caminhoCasa = new Elemento(318, 328, 132, 226);
        caminhos.add(caminhoCasa);

        Elemento caminhoPracaPrincipal = new Elemento(275, 395, 200, 280);
        caminhos.add(caminhoPracaPrincipal);

        Elemento caminhoPracaEsquerdo = new Elemento(150, 284, 245, 255);
        caminhos.add(caminhoPracaEsquerdo);

        Elemento caminhoCampo = new Elemento(385, 479, 240, 260);
        caminhos.add(caminhoCampo);

        Elemento caminho_inferior_1 = new Elemento(336, 353, 280, 390);
        caminhos.add(caminho_inferior_1);

        Elemento caminhoEsquerdo2 = new Elemento(212, 353, 370, 391);
        caminhos.add(caminhoEsquerdo2);

        Elemento caminhoHospitalPorta = new Elemento(212, 223, 350, 391);
        caminhos.add(caminhoHospitalPorta);

        Elemento caminho_pub = new Elemento(150, 162, 153, 255);
        caminhos.add(caminho_pub);
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
