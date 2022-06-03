package com.example.projetoecommercepet;

import java.io.Serializable;

public class Produtos implements Serializable {
    private String nome;
    private double preco;
    private int img;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produtos(String nome, double preco, int img) {
        this.nome = nome;
        this.preco = preco;
        this.img = img;
    }

    public Produtos() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}

