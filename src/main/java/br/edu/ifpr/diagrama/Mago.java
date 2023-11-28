/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.diagrama;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Mago extends Personagem {
    private int inteligencia;
    private int recuperacao;

    public Mago() {

    }

    public Mago(String nome) {
        this.nome = nome;
        this.pontosVida = 100; // Pode ser um valor padrão ou também random, como preferir
        this.pontosAtaque = new Random().nextInt(6) + 20; // Random entre 20 e 25
        this.pontosDefesa = new Random().nextInt(6) + 5; // Random entre 5 e 10
        this.inteligencia = (this.pontosAtaque - 2) * (new Random().nextInt(9) + 2); // Random entre 2 e 10
        this.recuperacao = (this.pontosAtaque - 2) * (new Random().nextInt(9) + 2); // Random entre 2 e 10
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getRecuperacao() {
        return recuperacao;
    }

    public void setRecuperacao(int recuperacao) {
        this.recuperacao = recuperacao;
    }

    public void receberDano(int dano) {
        this.pontosVida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + pontosVida);
    }

    public int conjurarMagia() {
        System.out.println(nome + " conjura uma magia com poder " + pontosAtaque);
        return pontosAtaque;
    }

    @Override
    public String toString() {
        return "Mago{" + "nome=" + nome + ", pontosVida=" + pontosVida
                + ", pontosAtaque=" + pontosAtaque + ", pontosDefesa=" + pontosDefesa + ", inteligencia=" + inteligencia + ", recuperacao=" + recuperacao + '}';
    }

}
