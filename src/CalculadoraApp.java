import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("*************** Aplicación Calculadora ***************");

        Scanner opcion = new Scanner(System.in);
        float num1 = 0, num2 = 0;
        int opcionOperacion;

        do {
            System.out.println(" ");
            System.out.println("¿ Qué operación deseas realizar ?");
            System.out.println(" ");
            System.out.println("1) Suma \n2)Resta \n3)Multiplicación \n4)División \n5)Salir");
            opcionOperacion = opcion.nextInt();
        }   while (opcionOperacion < 1 || opcionOperacion > 5);

        switch (opcionOperacion) {
            case 1:
                System.out.println("Digita el primer valor: ");
                num1 = opcion.nextFloat();
                System.out.println("Digita el segundo valor: ");
                num2 = opcion.nextFloat();
                System.out.println("La Suma es : " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Digita el primer valor: ");
                num1 = opcion.nextFloat();
                System.out.println("Digita el segundo valor: ");
                num2 = opcion.nextFloat();
                System.out.println("La Resta es : " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Digita el primer valor: ");
                num1 = opcion.nextFloat();
                System.out.println("Digita el segundo valor: ");
                num2 = opcion.nextFloat();
                System.out.println("La Multiplicación es : " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Digita el primer valor: ");
                num1 = opcion.nextFloat();
                System.out.println("Digita el segundo valor: ");
                num2 = opcion.nextFloat();
                System.out.println("La División es : " + num1 + " / " + num2 + " = " + (num1/num2));
                break;
            case 5:
                System.out.println("Adios");
          }
       }

}

