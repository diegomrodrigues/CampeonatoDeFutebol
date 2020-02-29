package br.com.drsolutions.campeonato.participantes;

/**
 * Pessoas (jogadores e técnicos) dos times de futebol
 *
 * @author Diego Mendes Rodrigues
 */
public class Pessoa {
    private String nome;
    private String telefone;

    /* Construtores */
    public Pessoa() {
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    /* Getters e Setters */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
