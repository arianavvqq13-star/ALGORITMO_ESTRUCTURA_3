
package semana13;
import java.util.Scanner;
import Libreria.*;
public class SEMANA13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {

            System.out.println("\n===== LABORATORIO ÁRBOLES =====");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Mostrar Preorden");
            System.out.println("3. Mostrar Inorden");
            System.out.println("4. Mostrar Postorden");
            System.out.println("0. Salir");

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese dato: ");
                    int dato = sc.nextInt();
                    arbol.insertar(dato);
                    break;

                case 2:
                    arbol.preorden();
                    break;

                case 3:
                    arbol.inorden();
                    break;

                case 4:
                    arbol.postorden();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
