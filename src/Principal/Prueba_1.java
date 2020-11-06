package Principal;

import java.util.Scanner;

public class Prueba_1 {
    public static void main(String[] args) {
        Double a,b;
        //insercion de dato 
        Scanner sc =  new Scanner(System.in); 
        System.out.println("Ingrese un #: ");
        a = sc.nextDouble();
        System.out.println("Ingrese otro #: ");
        b = sc.nextDouble();
        //salida de datos
        System.out.println("la suma es: "+suma(a,b));
        System.out.println("la resta es: "+resta(a,b));
        System.out.println("el producto es: "+producto(a,b));
        System.out.println("la division es: "+division(a,b));
    }
    //metodo estatico para sumar y igualmente con los demas
    static Double suma(Double a , Double b){
        Double suma;
        suma = a +b ;
        //dato de retorno del metodo
        return suma;
    }
    static Double resta(Double a , Double b){
        Double resta;
        resta = a -b ;
        
        return resta;
    }
    static double producto(double a , double b){
        double rpta;
        rpta = a *b ;
        
        return rpta;
    }
     static double division(double a , double b){
        double rpta;
        rpta = a /b ;
        
        return rpta;
    }
}
