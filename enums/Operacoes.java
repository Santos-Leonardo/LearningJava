package com.leonardo.learning.enums;

public enum Operacoes {

    SOMAR('+') {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },

    SUBTRAIR('-') {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },

    MULTIPLICAR('*') {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },

    DIVIDIR('/') {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private char valor;

    Operacoes(char valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Operacoes{" +
                "valor=" + valor +
                '}';
    }

    //Quando temos um método abstrato em um enum esse método deve ser implementado por todos os elementos do enum.
    public abstract double executarOperacao(double x, double y);

}
