package com.leonardo.learning.enums;

public enum DiaSemanaConstrutor {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    //Como o construtor é usado dentro da classe o construtor sempre será privado. Note que as instâncias têm um valor
    //passado.
    DiaSemanaConstrutor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
