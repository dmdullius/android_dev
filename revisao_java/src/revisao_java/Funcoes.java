
package revisao_java;



public class Funcoes {

    public static int somarNumeros(int valor1, int valor2) {

        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }
   static int [] num={11,3,12,4,50,60,70};
  public static int somarNumeros_a(int [] numeros) {

        int  resultado = 0;

         
     for(int i = 0; i<num.length;i++){
			resultado = num[i]+num[i]+num[i]+num[i]+num[i]+num[i]+num[i];
			
		}
           System.out.println(" O RESULTADO DA SOMA DO ARRAY É:  " +resultado);
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
}





