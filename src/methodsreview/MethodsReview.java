/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsreview;

//El parametro static dentro del metodo hace referencia a que forma
//de la clase main y no es necesario crear una instancia pata poder acceder a él

public class MethodsReview {
    static void saluda(){
        System.out.println("Dentro del método suma");
    }
    static void suma(int numero1,int numero2){
        
        System.out.println("El resultado de la suma es: "+(numero1+numero2));
    }
    //El ámbito es distinto -> ambito local
    static int resta(int numero1, int numero2){
        return numero1-numero2;
    }
    
    /*
    Sobrecarga
    int miMetodo(int x)
    float miMetodo(float x)
    */
    
    static int sumaSobreCarga(int n1,int n2){
        return n1+n2;
    }
    
    static double sumaSobreCarga(double n1,double n2){
        return n1+n2;
    }

    public static void main(String[] args) {
        saluda();
        suma(2,2);
        int resultado=resta(2,2);
        System.out.println("El valor de la resta es: \t"+resultado);
        sumaSobreCarga(5.5, 5.5);
        sumaSobreCarga(5.6, 59.6);
                
    
}
}
