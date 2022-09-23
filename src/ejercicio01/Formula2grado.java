package ejercicio01;
import java.util.Scanner;//Nos ayuda a leer ficheros y datos

public class Formula2grado{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        //Valores de la ecuación de 2° grado
        double a,b,c;

        //Posibles resultados
        double X0,X1;

        System.out.println("Valor a:");
        a = sc.nextDouble();

        System.out.println("Valor b:");
        b = sc.nextDouble();

        System.out.println("Valor c:");
        c = sc.nextDouble();

        double numero = (b*b) - (4*a*c);
        if(numero > 0) {
            X0 =  (-b +Math.sqrt(numero))/(2*a);
            X1 =  (-b -Math.sqrt(numero))/(2*a);
            System.out.println("La ecuacion tiene dos soluciones");
            System.out.println("X0:"  +X0);
            System.out.println("X1:"  +X1);
        }else {
            if(numero == 0) {
                X0 = (-b) / 2*a;
                System.out.println("La ecuacion tiene una solucion");
                System.out.println("X0:"  +X0);
            } else {
                System.out.println("La ecuacion no tien solución");
            }
        }

    }
}

