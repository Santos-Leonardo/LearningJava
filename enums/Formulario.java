package com.leonardo.learning.enums;

public class Formulario {

    enum Genero {
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }

        public char getValor() {
            return valor;
        }
    }

    //Atributos
    private String nome;
    private Genero genero;

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
