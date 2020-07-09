package com.leonardo.learning.other;

//Importanto apenas métodos estáticos
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//Série de exercícios aleatórios apenas para treinar novos conseitos
public class Tests {

    public static void main(String[] args) {

        //Autoboxing:
        Integer num = 5;    //Usando Whapper classes
        int num2 = 5;

        Long lo = 1020l;
        Short s = 500;
        System.out.println(num == num2);

        //Importando métodos estáticos
        System.out.println(pow(num, num2));
        System.out.println(sqrt(lo));   //Seria o mesmo de Math.sqrt(lo);

        //Varargs
        System.out.println(soma(5, 8, 10, 2));

        int a = 1205215;
        System.out.printf("%,d%n", a);    //Colocando uma vírgula (PC em EN) o printf formata o número com vírgulas.

        //Verificando uso de memória do programa
        System.out.println("Memória utilizada: " +memoriaDoPrograma());
        Runtime.getRuntime().gc(); //Chamado o Garbage Collector para limpar a memória não utilizada (Não usual).
        System.out.println("Memória limpa pelo gc.");
        System.out.println("Memória utilizada: " +memoriaDoPrograma());
    }

    //Varargs possibilita passar infinitos parâmetros para um método. É criado um array, sendo este do tipo Whapper.
    public static int soma(Integer... numeros) {

        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }

        return soma;
    }

    public static double memoriaDoPrograma() {

        Runtime runtime = Runtime.getRuntime();//singleton

        double memoria = runtime.totalMemory() - runtime.freeMemory();  //Para descobrir a memória que o programa está
        //usando basta pegar o total de memória disponível na JVM e diminuir pelo memória livre na JVM.

        double MB = 1024 * 1024; //O valor retornado é em bytes, então dividimos por esse valor para ter o valor em MB

        return memoria/MB;
    }

}
