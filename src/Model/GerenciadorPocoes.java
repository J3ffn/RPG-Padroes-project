package Model;

import States.EstadoBase;
import States.EstadoBebado;
import States.EstadoFlash;

public class GerenciadorPocoes extends GerenciadorElementos {

  @Override
  public void CriarElementos() {
    Pocao hidromel = new PocaoHidromel(152, 173, "img/pocoes/hidromel.png");
    hidromel.setNome("Hidromel");
    hidromel.setName("Poção de Hidromel");
    hidromel.setEstado(new EstadoBebado());
    elementos.add(hidromel);

    Pocao pocaoVelocidade = new PocaoVelocidade(323, 152, "img/pocoes/velocidade.png");
    pocaoVelocidade.setNome("Poçao de velocidade");
    pocaoVelocidade.setName("Poção de Velocidade");
    pocaoVelocidade.setEstado(new EstadoFlash());
    elementos.add(pocaoVelocidade);

    Pocao pocaoVida = new PocaoVida(216, 370, "img/pocoes/cura.png");
    pocaoVida.setNome("Poçao de vida");
    pocaoVida.setName("Poção de Vida");
    
    elementos.add(pocaoVida);

    Pocao copoLeite = new PocaoLeite(300, 213, "img/pocoes/leite.png");
    copoLeite.setNome("Copo de leite");
    copoLeite.setName("Poção de Leite");
    copoLeite.setEstado(new EstadoBase());
    elementos.add(copoLeite);
  }

  public void aplicarEfeitos(Pocao pocao) {

  }

}
