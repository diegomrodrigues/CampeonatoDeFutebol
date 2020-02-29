package br.com.drsolutions.campeonato.times;

import br.com.drsolutions.campeonato.participantes.Jogador;
import br.com.drsolutions.campeonato.participantes.Pessoa;

import java.util.List;

/**
 * Times de futebol
 *
 * @author Diego Mendes Rodrigues
 */
public class Time {
    private String nome;
    private List<Jogador> jogadores;
    private Pessoa tecnico;

    /* Construtores */
    public Time() {
    }

    public Time(String nome, List<Jogador> jogadores, Pessoa tecnico) {
        this.nome = nome;
        this.jogadores = jogadores;
        this.tecnico = tecnico;
    }

    /**
     * Exibir no console os jogadores do time
     */
    public void exibirJogadores() {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNumeroCamisa() + " - " + jogador.getNome() + " - " + jogador.getPosicao());
        }
    }

    /**
     * Exibir no console as informações do time
     */
    public void exibirTime() {
        System.out.println("=====================================");
        System.out.println(nome);
        System.out.println("=====================================");
        System.out.println("Técnico:\n" + tecnico.getNome());
        System.out.println("\nJogadores:");
        this.exibirJogadores();
        System.out.println("=====================================\n");
    }

    /* Getters e Setters */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Pessoa getTecnico() {
        return tecnico;
    }

    public void setTecnico(Pessoa tecnico) {
        this.tecnico = tecnico;
    }
}
