import java.util.Scanner;
public class Circulo {
    // Programa que Calcula el Area de un circulo por medio del radio
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Definimos las entradas y as constantes
        double radio;
        double pi = 3.141592;
        System.out.print("Ingrese el radio del Circulo: ");
        radio = entrada.nextInt();
        // Carculo del radio
        double area = pi*radio*radio;
        // Imprimimos el resultado
        System.out.println("El area del circulo es: "+area+" unidades");        
    }
    
}
