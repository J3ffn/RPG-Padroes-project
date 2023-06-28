package src.States;


import src.Model.Personagem;

public class EstadoFuria extends EstadoPersonagem {
    public EstadoFuria() {
        setVelocidade(2);
        setDefesa(0);
        setAtaque(5);
        setVidaMaxima(5);
    }

    @Override
    boolean atacar(Personagem inimigo) {
        int defesaInimigo = inimigo.getEstadoAtual().getDefesa();
        boolean isSucesso = true;
        for (int i = 0; i <= 2; i++) {
            if (defesaInimigo >= getAtaque()) {
                isSucesso = false;
                break;
            } else {
                inimigo.perderVida(getAtaque());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return isSucesso;
    }
}
