package br.com.drsolutions.campeonato.locais;

/**
 * Estádios das partidas
 *
 * @author Diego Mendes Rodrigues
 */
public class Estadio {
    private String nome;
    private Endereco endereco;

    /* Construtores */
    public Estadio() {
    }

    public Estadio(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    /**
     * Exibir no console o estádio
     */
    public void exibirEstadio() {
        System.out.println("=====================================");
        System.out.println(nome);
        System.out.println("=====================================");
        System.out.println("Endereço:");
        endereco.exibirEndereco();
        System.out.println("=====================================\n");
    }

    /* Getters e Setters */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
