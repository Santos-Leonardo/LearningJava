package com.leonardo.learning.enums;

public class Test {

    public static void main(String[] args) {

        //Ex 01
        DiasSemana segunda = DiasSemana.SEGUNDA;
        DiasSemana quinta = DiasSemana.QUINTA;
        System.out.println(segunda);
        System.out.println(quinta);

        //Ex 02
        DiaSemanaConstrutor dia = DiaSemanaConstrutor.DOMINGO;
        System.out.println(dia + " " +dia.getValor());

        //Ex 03
        Formulario form = new Formulario();
        form.setGenero(Formulario.Genero.FEMININO);
        System.out.println(form.getGenero());

        System.out.println();

        for(DiasSemana dias : DiasSemana.values()) {
            System.out.println(dias);
        }

        //Ex 04
        System.out.println();
        for(Operacoes op : Operacoes.values()) {
            System.out.println(op.executarOperacao(5, 10));
        }

    }
}
