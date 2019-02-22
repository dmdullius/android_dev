/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_java;

/**
 *
 * @author dmdullius
 */
public class revisao_for_while {
    public static void main (String[] args){
        for(int x = 0; x<=1000; x++){
            System.out.println("valor: " +x);
        } 
        int x = 15;
        while(x < 18){
            System.out.println("Você não tem permissão para entrar");
            x++;
        }
        
    }
}
