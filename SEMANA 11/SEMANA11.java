package semana11;

import Libreria.*;
import java.util.Scanner;

public class SEMANA11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaEstatica pilaE = new PilaEstatica(5);
        PilaDinamica pilaD = new PilaDinamica();

        int opcion;

        do {

            System.out.println("\n===== LABORATORIO PILAS =====");
            System.out.println("1. Push Pila Estática");
            System.out.println("2. Pop Pila Estática");
            System.out.println("3. Mostrar Pila Estática");
            System.out.println("4. Push Pila Dinámica");
            System.out.println("5. Pop Pila Dinámica");
            System.out.println("6. Mostrar Pila Dinámica");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese dato: ");
                    pilaE.push(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Elemento eliminado: "
                            + pilaE.pop());
                    break;

                case 3:
                    pilaE.mostrar();
                    break;

                case 4:
                    System.out.print("Ingrese dato: ");
                    pilaD.push(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Elemento eliminado: "
                            + pilaD.pop());
                    break;

                case 6:
                    pilaD.mostrar();
                    break;

                case 7:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        sc.close();
    }
}