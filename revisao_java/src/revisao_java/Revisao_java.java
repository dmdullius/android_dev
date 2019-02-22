package revisao_java;

public class Revisao_java {

    //metodo de inicializacao da classe
    public static void main(String[] args) {
        
//instanciando a classe Funcoes

Funcoes func = new Funcoes();

//declarar variavel do tipo inteiro
        int soma;

        int multiplica = func.multiplicaNumeros(2, 3);

        int subtrai = func.subtraiNumeros(2, 3);

        int divide = func.divideNumeros(4, 5);

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

    }

}
