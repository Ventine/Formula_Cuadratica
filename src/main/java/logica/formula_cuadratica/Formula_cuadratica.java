package logica.formula_cuadratica;

import java.util.Scanner;

public class Formula_cuadratica {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el valor de a: ");
            double a = scanner.nextDouble();
            
            System.out.println("Ingrese el valor de b: ");
            double b = scanner.nextDouble();
            
            System.out.println("Ingrese el valor de c: ");
            double c = scanner.nextDouble();
            
            double discriminante = calcularDiscriminante(a,b,c);
            if(discriminante < 0){
                System.out.println("No tiene raices reales");
            }else{
                calcularRaices(a,b,discriminante);
            }
        }
    }
    
    private static double calcularDiscriminante(double a, double b, double c){
        return Math.pow(b, 2) - 4* a *c;
    }
    
    private static void calcularRaices(double a, double b, double discriminante){
        double x1 =  (-b+Math.sqrt(discriminante))/2*a;
        double x2 =  (-b-Math.sqrt(discriminante))/2*a;
        
        if(x1 == x2){
            System.out.println("La raiz es: " + x1 + " con multiplicidad 2");
        }else{
              System.out.println("La raiz uno es: " + x1 + " La raiz dos es: " + x2);          
        }
    }
}









































































