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
public class Guerreira extends Personagem {

    private int forca;
    private int velocidade;

    public Guerreira() {
    }

    public Guerreira(String nome) {
        this.nome = nome;
        this.pontosVida = 100; // Pode ser um valor padrão ou também random, como preferir
        this.pontosAtaque = new Random().nextInt(6) + 20; // Random entre 20 e 25
        this.pontosDefesa = new Random().nextInt(6) + 10; // Random entre 10 e 15
        this.forca = (this.pontosAtaque - 2) * (new Random().nextInt(9) + 2); // Random entre 2 e 10
        this.velocidade = (this.pontosAtaque - 2) * (new Random().nextInt(9) + 2); // Random entre 2 e 10
        
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void receberDano(int dano) {
        this.pontosVida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + pontosVida);
    }

    public int atacar() {
        System.out.println(nome + " ataca com força " + pontosAtaque);
        return pontosAtaque;
    }

    @Override
    public String toString() {
        return "Guerreira{" + "nome=" + nome + ", pontosVida=" + pontosVida + ", pontosAtaque="
                + pontosAtaque + ", pontosDefesa=" + pontosDefesa + ", forca=" + forca + ", velocidade=" + velocidade + '}';
    }

    String getPontoVida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
