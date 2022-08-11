/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodsreview;

/**
 *
 * @author danim
 */
public class recursion {
    /*
    La recursion es la tecnica para hacer que una función
    se llame a sí misma
    
    Crear un metodo para sumar toods los numero hasta 10
    */
    
    public static int suma(int k){
        if (k>0) {
            System.out.println("Se llama a función");
           return k+suma(k-1);
           
        }
        else{
            System.out.println("Se detiene la recursividad");
            return 0;
        }
    }
    
    // sumar numeros entre determinado rango
    public static int suma(int inicio, int fin){ //5,10
        if (fin>inicio) {
            return fin+suma(inicio,fin-1);
        }else{
            return fin;
        }
    }
    
    public static void main(String[] args) {
        int resultado=suma(5,10);
        System.out.println("El valor de la suma es:"+resultado);
        
    }
}
