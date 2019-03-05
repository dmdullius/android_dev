package revisao_java;

public class Revisao_java {

    //metodo de inicializacao da classe
    public static void main(String[] args) {

//instanciando a classe Funcoes
        Funcoes func = new Funcoes();

//declarar variavel do tipo inteiro
        int soma;

        int multiplica;

        int subtrai;

        int divide;

        int multiplica_a = Funcoes.multiplicaNumeros_a(Funcoes.num);

        int soma_a = Funcoes.somarNumeros_a(Funcoes.num);

        double divide_a = Funcoes.divideNumeros(Funcoes.num);
        double numeros_sorteados_mr = 0;
        int subtrai_a = Funcoes.subtraiNumeros_a(Funcoes.num);

        //aula 1
        //atribuir o valor retornado
        soma = Funcoes.somarNumeros(2, 3);

        multiplica = func.multiplicaNumeros(2, 3);

        subtrai = func.subtraiNumeros(3, 2);

        divide = func.divideNumeros(10, 5);

        //imprimindo no console os resultados
        System.out.println("soma = " + soma);

        System.out.println("subtração = " + subtrai);

        System.out.println("multiplicação = " + multiplica);

        System.out.println("divisão = " + divide);

        //aula 2
        System.out.println("----------AULA_2-----------");
        System.out.println("Olá Mundo");
        //----------------------------------------------------------------------------------------------
        System.out.println("-----------Metodos com array-----------");

        System.out.println("Resultado da soma: " + soma_a);
        System.out.println("----------------------------------------");
        System.out.println("Resultado da multiplicação: " + multiplica_a);
        System.out.println("----------------------------------------");
        System.out.println("Resultado da divisão: " + divide_a);
        System.out.println("----------------------------------------");
        System.out.println("Resultado da subtração: " + subtrai_a);
        System.out.println("----------------------------------------");
        for (int i = 0; i <= 1000; i++) {
            double numero_aleatorio = (Math.random() * 11) + 1;
            System.out.println("Numero gerado: " + (int) numero_aleatorio);
        }
        System.out.println("----------------------------------------");

         for (int i = 1; i <= 6; i++) {
            
            numeros_sorteados_mr = (Math.random() * 5) +1;
            
            System.out.println("Numeros sorteados: " + (int) numeros_sorteados_mr);

        }
        
        System.out.println("----------------------------------------");
    }
}

