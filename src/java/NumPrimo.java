/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win 7
 */
public class NumPrimo {
    
   
  public static void main(String[] args) {
    int quantidade = 50; // quantidade de números primos
    int contador = 0; // quantidade de números primos encontrados
    int numero = 0; // inteiro inicial             
               
    // Lembre-se! O número 1 não é primo
    System.out.println(quantidade + " primeiros numeros primos:\n");
  
    // laço while será executado até encontrar os 50 primeiros números primos 
    while(contador < quantidade){
      boolean primo = true;
                       
      // se o valor de i for 7, a variável j do laço contará
      // de 2 até 7 / 2 (divisão inteira), ou seja, 3. Se o 
      // módulo de 7 por qualquer um dos valores neste intervalo 
      // for igual a 0, então o número não é primo
      for(int j = 2; j <= (numero / 2); j++){
        if(numero % j == 0){
          primo = false; // não é primo
          break;
        }
      }
    
      if((primo) && (numero > 1)){
        System.out.printf("%6d", numero);
        contador++; // encontramos um número primo
      
        if(contador % 10 == 0){
          System.out.println();
        }
      }  
      
      numero++;
    }
  }
}
    

