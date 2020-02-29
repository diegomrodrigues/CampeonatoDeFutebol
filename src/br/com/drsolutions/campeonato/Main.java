package br.com.drsolutions.campeonato;

import br.com.drsolutions.campeonato.locais.Endereco;
import br.com.drsolutions.campeonato.locais.Estadio;
import br.com.drsolutions.campeonato.partidas.Partida;
import br.com.drsolutions.campeonato.times.parapartidas.Regatas;
import br.com.drsolutions.campeonato.times.parapartidas.Tupy;

/**
 * Exemplo de um sistema para uma partida futebol
 *
 * @author Diego Mendes Rodrigues
 */
public class Main {
    /**
     * Função principal do sistema
     *
     * @param args
     */
    public static void main(String[] args) {
        /* Time Tupy */
        Tupy tupy = new Tupy();

        /* Time Regatas */
        Regatas regatas = new Regatas();

        /* Estádio da partida */
        Estadio estadioTriunfo = new Estadio("Estádio do Triunfo",
                new Endereco("Rua do Triunfo",
                        "153",
                        "",
                        "Santa Ifigênia",
                        "São Paulo",
                        "SP",
                        "01212-010"));

        /* Partida */
        Partida partida = new Partida(tupy, regatas, estadioTriunfo);

        /* Alterar o placar */
        partida.setGolsTime1(3);
        partida.setGolsTime2(1);

        /* Exibir as informações da partida */
        partida.exibirPartida();
    }
}
