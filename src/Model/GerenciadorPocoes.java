package Model;

import States.EstadoBebado;
import States.EstadoFuria;
import States.EstadoFlash;
import States.EstadoBase;

public class GerenciadorPocoes extends GerenciadorElementos {

    @Override
    public void CriarElementos() {
        Pocao hidromel = new Pocao(153, 171, 173, 189);
        hidromel.setNome("Hidromel");
        hidromel.setEstado(new EstadoBebado());
        getElementos().add(hidromel);

        Pocao pocaoVelocidade = new Pocao(330, 345, 152, 167);
        pocaoVelocidade.setNome("Poçao de velocidade");
        pocaoVelocidade.setEstado(new EstadoFlash());
        getElementos().add(pocaoVelocidade);

        Pocao pocaoVida = new Pocao(222, 237, 370, 385);
        pocaoVida.setNome("Poçao de vida");
        getElementos().add(pocaoVida);

        Pocao copoLeite = new Pocao(222, 237, 370, 385);
        copoLeite.setNome("Copo de leite");
        copoLeite.setEstado(new EstadoBase());
        getElementos().add(copoLeite);
    }
    
}
