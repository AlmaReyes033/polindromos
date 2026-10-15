/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificacionentorno;

/**
 *
 * @author Alma Reyes
 */
public class palindromorecursivo {

    // En el metodo main comprobe si las palabras son palindromo con 3 palabras
    public static void main(String[] args) {
        System.out.println(esPalindromo("radar")); 
        System.out.println(esPalindromo("Reconocer"));  
        System.out.println(esPalindromo("calculadora"));  
    }
    
    public static boolean esPalindromo(String palabra) {
        if (palabra == null) {
            return false;
        }
        // esto convierte las letras a minúsculas para que no afecte al momento de comparar
        palabra = palabra.toLowerCase();
        // Iniciar la recursión
        return esPalindromoAux(palabra, 0, palabra.length() - 1);
    }

    // metodo recursivo auxiliar
    private static boolean esPalindromoAux(String palabra, int inicio, int fin) {
        // Caso Base 1: Éxito (se cruzaron o igualaron los índices)
        if (inicio >= fin) {
            return true;
        }
        // nos da falso si las letras de los extremos no coinciden
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        // Paso Recursivo avanzar los índices hacia el centro
        return esPalindromoAux(palabra, inicio + 1, fin - 1);
    }
}


