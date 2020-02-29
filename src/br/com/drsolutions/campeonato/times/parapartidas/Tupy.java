package br.com.drsolutions.campeonato.times.parapartidas;

import br.com.drsolutions.campeonato.participantes.Jogador;
import br.com.drsolutions.campeonato.participantes.Pessoa;
import br.com.drsolutions.campeonato.times.Posicoes;
import br.com.drsolutions.campeonato.times.Time;

import java.util.ArrayList;
import java.util.List;

/**
 * Time "Tupy Futebol Clube"
 *
 * @author Diego Mendes Rodrigues
 */
public class Tupy extends Time {
    public Tupy() {
        List<Jogador> equipe = new ArrayList<Jogador>();

        /* Jogadores do time */
        Jogador j1 = new Jogador("Cassio", "964010369", Posicoes.Goleiro, 1);
        Jogador j2 = new Jogador("André", "914883119", Posicoes.Zagueiro, 2);
        Jogador j3 = new Jogador("Alves", "979355224", Posicoes.Zagueiro, 3);
        Jogador j4 = new Jogador("Diego", "924401903", Posicoes.LateralDireito, 4);
        Jogador j5 = new Jogador("Sergio", "940091589", Posicoes.LateralEsquerdo, 5);
        Jogador j6 = new Jogador("Roberto", "991789624", Posicoes.Meia, 6);
        Jogador j7 = new Jogador("Carlos", "946638088", Posicoes.Meia, 7);
        Jogador j8 = new Jogador("Luan", "989584584", Posicoes.Volante, 8);
        Jogador j9 = new Jogador("Ricardo", "932611890", Posicoes.Volante, 9);
        Jogador j10 = new Jogador("Gabriel", "963287841", Posicoes.Atacante, 10);
        Jogador j11 = new Jogador("Neymar", "950678637", Posicoes.Atacante, 11);
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

        this.setNome("Tupy Futebol Clube");
        this.setJogadores(equipe);
        this.setTecnico(new Pessoa("Telê Santana", "985712578"));
    }
}
