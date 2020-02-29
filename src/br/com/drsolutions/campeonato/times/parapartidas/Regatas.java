package br.com.drsolutions.campeonato.times.parapartidas;

import br.com.drsolutions.campeonato.participantes.Jogador;
import br.com.drsolutions.campeonato.participantes.Pessoa;
import br.com.drsolutions.campeonato.times.Posicoes;
import br.com.drsolutions.campeonato.times.Time;

import java.util.ArrayList;
import java.util.List;

/**
 * Time "Regatas Atlético Clube"
 *
 * @author Diego Mendes Rodrigues
 */
public class Regatas extends Time {
    public Regatas() {
        List<Jogador> equipe = new ArrayList<Jogador>();

        /* Jogadores do time */
        Jogador j1 = new Jogador("Júlio César", "995469631", Posicoes.Goleiro, 1);
        Jogador j2 = new Jogador("Alex", "910996214", Posicoes.Zagueiro, 2);
        Jogador j3 = new Jogador("Alaba", "909284242", Posicoes.Zagueiro, 3);
        Jogador j4 = new Jogador("Renzo", "906815351", Posicoes.LateralDireito, 4);
        Jogador j5 = new Jogador("Marcelo", "924416506", Posicoes.LateralEsquerdo, 5);
        Jogador j6 = new Jogador("Enzo", "927628546", Posicoes.Meia, 6);
        Jogador j7 = new Jogador("Eduardo", "970381962", Posicoes.Meia, 7);
        Jogador j8 = new Jogador("Mathias", "908531082", Posicoes.Volante, 8);
        Jogador j9 = new Jogador("Felipe", "932354117", Posicoes.Volante, 9);
        Jogador j10 = new Jogador("Cristiano", "972680718", Posicoes.Atacante, 10);
        Jogador j11 = new Jogador("Messi", "905155009", Posicoes.Atacante, 11);
        equipe.add(j1);
        equipe.add(j2);
        equipe.add(j3);
        equipe.add(j4);
        equipe.add(j5);
        equipe.add(j6);
        equipe.add(j7);
        equipe.add(j8);
        equipe.add(j9);
        equipe.add(j10);
        equipe.add(j11);

        this.setNome("Regatas Atlético Clube");
        this.setJogadores(equipe);
        this.setTecnico(new Pessoa("Rui Vitória", "997726571"));
    }
}
