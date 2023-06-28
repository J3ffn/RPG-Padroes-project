package Model;

public class Caminho {
    private int xCantoEsquerdo;
    private int yCantoSuperior;

    private int xCantoDireito;
    private int yCantoInferior;

    public Caminho(int xCantoEsquerdo, int xCantoDireito, int yCantoSuperior, int yCantoInferior){
        this.xCantoEsquerdo = xCantoEsquerdo;
        this.xCantoDireito = xCantoDireito;
        this.yCantoSuperior = yCantoSuperior;
        this.yCantoInferior = yCantoInferior;
    }

    

    public boolean isDentro(int x, int y){
        if (xCantoEsquerdo<x && xCantoDireito>x){
            if(yCantoSuperior>y && yCantoInferior<y){
                return true;
            }
        }
        return false;
    }
}
