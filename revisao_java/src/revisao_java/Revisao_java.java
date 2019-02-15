package revisao_java;

public class Revisao_java {

    //metodo de inicializacao da classe
    public static void main(String[] args) {
        System.out.println("Método Main");
        //declarar variavel do tipo inteiro
        int soma;

        int multiplica = multiplicaNumeros(2, 3);

        int subtrai = subtraiNumeros(2, 3);

        int divide = divideNumeros(4, 5);

        //atribuir o valor retornado
        soma = somarNumeros(2, 3);

        multiplica = multiplicaNumeros(2, 3);

        subtrai = subtraiNumeros(2, 3);

        divide = divideNumeros(4, 5);

        System.out.println("soma = " + soma);

        System.out.println("subtração = " + subtrai);

        System.out.println("multiplicação = " + multiplica);

        System.out.println("divisão = " + divide);

    }

    private static int somarNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }

    private static int subtraiNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 - valor2;
        return resultado;
    }

    private static int multiplicaNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 * valor2;
        return resultado;
    }

    private static int divideNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 / valor2;
        return resultado;
    }
}
