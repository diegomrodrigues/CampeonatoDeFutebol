package br.com.drsolutions.campeonato.partidas;

import br.com.drsolutions.campeonato.locais.Estadio;
import br.com.drsolutions.campeonato.times.Time;

/**
 * Partidas de futebol
 *
 * @author Diego Mendes Rodrigues
 */
public class Partida {
    private Time time1;
    private Time time2;

    private Estadio estadio;

    private int golsTime1;
    private int golsTime2;

    /* Construtores */
    public Partida() {
    }

    public Partida(Time time1, Time time2, Estadio estadio) {
        this.time1 = time1;
        this.time2 = time2;
        this.estadio = estadio;
        golsTime1 = golsTime2 = 0;
    }

    /**
     * Exibir no console as informações da partida
     */
    public void exibirPartida() {
        time1.exibirTime();
        time2.exibirTime();
        estadio.exibirEstadio();
        exibirPlacar();
    }

    /**
     * Exibir no console o placar da partida
     */
    public void exibirPlacar() {
        String[] nomeTime1 = time1.getNome().split(" ");
        String[] nomeTime2 = time2.getNome().split(" ");
        System.out.println("=====================================");
        System.out.println("  P L A C A R   D A   P A R T I D A");
        System.out.println("=====================================");
        System.out.println(nomeTime1[0] + " " + golsTime1 + " X " + golsTime2 + " " + nomeTime2[0]);

        if (golsTime1 == golsTime2)
            System.out.println("Resultado: Empate");
        else if (golsTime1 > golsTime2)
            System.out.println("Resultado: " + nomeTime1[0] + " é o time vencedor");
        else
            System.out.println("Resultado: " + nomeTime2[0] + " é o time vencedor");

        System.out.println("=====================================\n");
    }

    /* Getters e Setters */
    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public int getGolsTime1() {
        return golsTime1;
    }

    public void setGolsTime1(int golsTime1) {
        this.golsTime1 = golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    public void setGolsTime2(int golsTime2) {
        this.golsTime2 = golsTime2;
    }
}
