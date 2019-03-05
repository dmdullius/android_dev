package revisao_java;

public class Funcoes {

    public static int somarNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 + valor2;
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

  

    public int divideNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 / valor2;
        return resultado;
    }
    
//--------------------------------------------REVISÃO ARRAY + FOR-----------------------------------------------------------------
    
    static int[] num = {3,2,3,5};
    
    public static int somarNumeros_a(int[] numeros) {

        int resultado = 0;

        for (int i = 0; i < num.length; i++) {

            resultado += i;

        }

        System.out.println(" O RESULTADO DA SOMA DO ARRAY É:  " + resultado);
        return resultado;
    }

    public static int multiplicaNumeros_a(int[] numeros) {
        int resultado = 1;

        for (int var : numeros) {

            resultado *= var;

        }
        
               

        System.out.println(" O RESULTADO DA MULTIPLICAÇÃO DO ARRAY É:  " + resultado);
        return resultado;
    }

 
    public static double divideNumeros(int [] numeros){
            double resultado = num[0];
            for (int i = 1; i<num.length; i ++){
                resultado /= num [i];
            }
            
    
    return resultado;
        }
    
 public static int subtraiNumeros_a(int [] numeros){
     int resultado = 1;
     for (int i = 0; i<num.length; i ++){
                resultado -= num [i];
    
             
 }
            
  return resultado;
 }
 
 
}

 

