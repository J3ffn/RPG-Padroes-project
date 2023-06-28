package States;


import Model.Personagem;

public class EstadoFuria extends EstadoPersonagem {
    public EstadoFuria() {
        setVelocidade(1.3f);
        setDefesa(0);
        setAtaque(5);
        setVidaMaxima(5);
    }
    
    @Override
    public boolean atacar(Model.Personagem inimigo) {
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
