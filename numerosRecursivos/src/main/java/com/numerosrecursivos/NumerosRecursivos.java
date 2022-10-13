



package com.numerosrecursivos;

/**
 *
 * @author Saryf
 */
public class NumerosRecursivos {

    public static void main(String[] args) {
      int n = 683;
        System.out.println(NumeroInvertido(n, 2));
    }
    
    public static int NumeroInvertido(int num, int p){
        
        if(num < 10){
            return num;
            
        }else{
            return(num % 10) * (int) Math.pow(10, p) + (NumeroInvertido(num/10, p-1));
        }
    }
}
