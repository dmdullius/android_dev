package revisao_java;

public class Funcoes {

    public static int somarNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }
    static int[] num = {1,2,3,4,5,6,7};

    public static int somarNumeros_a(int[] numeros) {

        int resultado = 0;

        for (int i = 0; i < num.length; i++) {

          
                resultado = num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]; 
            
        }
        System.out.println(" O RESULTADO DA SOMA DO ARRAY É:  " + resultado);
        return resultado;
    }

    public int subtraiNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 - valor2;
        return resultado;
    }

    public int multiplicaNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 * valor2;
        return resultado;
    }

    public static int multiplicaNumeros_a(int[] numeros) {
        int resultado = 0;

        for (int i = 0; i < num.length; i++) {
           
                resultado = num[0]*num[1]*num[2]*num[3]*num[4]*num[5]*num[6]; 

            
        }
        System.out.println(" O RESULTADO DA MULTIPLICAÇÃO DO ARRAY É:  " + resultado);
        return resultado;
    }

    public int divideNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 / valor2;
        return resultado;
    }
}
