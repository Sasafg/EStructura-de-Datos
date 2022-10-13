

package com.palabrarecursivo;

/**
 *
 * @author Saryf
 */
public class PalabraRecursivo {

    public static void main(String[] args) {
        String palabra = "Recursividad";
        System.out.println(PalabraInvertida(palabra, palabra.length()-1));    
  
    }
    
    
    public static String PalabraInvertida(String palabra, int tam){
        
        if(tam==0){
            return palabra.charAt(tam)+"";
    
        }else{
            return palabra.charAt(tam)+ (PalabraInvertida(palabra, tam-1));
        }
    }
    
}
