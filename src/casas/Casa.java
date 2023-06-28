package src.casas;

public abstract class Casa {

    private int[] posicao;

    private  int[] tamanho;

    public Casa(int x, int y, int width, int height) {
        posicao = new int[] {x, y};
        tamanho = new int[] {width, height};
    }

    public int[] getPosicao() {
        return posicao;
    }

    public void setPosicao(int x, int y) {
        posicao[0] = x;
        posicao[1] = y;
    }

    public void setPosicao(int[] posicao) {
        this.posicao = posicao;
    }

    public void setPosicaoX(int x) {
        posicao[0] = x;
    }

    public void setPosicaoY(int y) {
        posicao[1] = y;
    }

}
