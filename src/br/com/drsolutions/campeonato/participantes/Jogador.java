package br.com.drsolutions.campeonato.participantes;

import br.com.drsolutions.campeonato.times.Posicoes;

/**
 * Jogadores dos times de futebol
 *
 * @author Diego Mendes Rodrigues
 */
public class Jogador extends Pessoa {
    private Posicoes posicao;
    private int numeroCamisa;

    /* Construtores */
    public Jogador(String nome, String telefone) {
        super(nome, telefone);
    }

    public Jogador(String nome, String telefone, Posicoes posicao, int numeroCamisa) {
        super(nome, telefone);
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    /* Getters e Setters */
    public Posicoes getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicoes posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
