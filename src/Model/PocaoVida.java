package Model;

public class PocaoVida extends Pocao{

    public PocaoVida(int xEsquerdo, int yCima, String caminho) {
        super(xEsquerdo, yCima, caminho);
    }

    @Override
    public void aplicarEfeitos(Personagem personagem) {
        personagem.ganharVida(5);
    }
    
}
