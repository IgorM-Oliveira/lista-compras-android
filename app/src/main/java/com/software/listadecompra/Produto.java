package com.software.listadecompra;

public class Produto {

    String nome;
    String marca;
    Integer quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return (String.format("Produto: %s | Marca: %s | Quantidade: %d", nome, marca, quantidade));
    }
}
