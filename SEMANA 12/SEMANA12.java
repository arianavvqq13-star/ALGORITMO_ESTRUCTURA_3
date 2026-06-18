
package semana12;

import Libreria.*;
import java.util.Scanner;

public class SEMANA12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ColaCircular colaCircular = new ColaCircular(5);
        ColaLista colaLista = new ColaLista();
        ColaPrioridad colaPrioridad = new ColaPrioridad(10);

        int opcion;

        do {
            System.out.println("\n===== LABORATORIO COLAS =====");
            System.out.println("1. Encolar en Cola Circular");
            System.out.println("2. Desencolar de Cola Circular");
            System.out.println("3. Mostrar Cola Circular");

            System.out.println("4. Encolar en Cola Lista");
            System.out.println("5. Desencolar de Cola Lista");
            System.out.println("6. Mostrar Cola Lista");

            System.out.println("7. Encolar en Cola Prioridad");
            System.out.println("8. Desencolar de Cola Prioridad");
            System.out.println("9. Mostrar Cola Prioridad");

            System.out.println("0. Salir");

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Dato: ");
                    colaCircular.enqueue(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Eliminado: "
                            + colaCircular.dequeue());
                    break;

                case 3:
                    colaCircular.mostrar();
                    break;

                case 4:
                    System.out.print("Dato: ");
                    colaLista.enqueue(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Eliminado: "
                            + colaLista.dequeue());
                    break;

                case 6:
                    colaLista.mostrar();
                    break;

                case 7:
                    System.out.print("Dato: ");
                    colaPrioridad.enqueue(sc.nextInt());
                    break;

                case 8:
                    System.out.println("Eliminado: "
                            + colaPrioridad.dequeue());
                    break;

                case 9:
                    colaPrioridad.mostrar();
                    break;

                case 0:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
