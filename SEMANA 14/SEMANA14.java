package semana14;

import java.util.Scanner;
import Libreria.*;

public class SEMANA14 {

    public static void main(String[] args) {

        ArbolBinario arbol =
                new ArbolBinario();

        Scanner sc =
                new Scanner(System.in);

        int opcion, dato;

        do {

            System.out.println(
                    "\n===== ARBOL BST =====");

            System.out.println(
                    "1. Insertar");

            System.out.println(
                    "2. Buscar");

            System.out.println(
                    "3. Eliminar");

            System.out.println(
                    "4. Mostrar");

            System.out.println(
                    "5. Altura");

            System.out.println(
                    "6. Profundidad");

            System.out.println(
                    "7. Salir");

            System.out.print(
                    "Opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print(
                            "Dato: ");

                    dato = sc.nextInt();

                    arbol.insertar(dato);

                    break;

                case 2:

                    System.out.print(
                            "Buscar: ");

                    dato = sc.nextInt();

                    if (arbol.buscar(dato))
                        System.out.println(
                                "Dato encontrado");
                    else
                        System.out.println(
                                "Dato no encontrado");

                    break;

                case 3:

                    System.out.print(
                            "Eliminar: ");

                    dato = sc.nextInt();

                    arbol.eliminar(dato);

                    break;

                case 4:

                    System.out.print(
                            "Arbol: ");

                    arbol.mostrar();

                    break;

                case 5:

                    System.out.println(
                            "Altura: "
                                    + arbol.altura());

                    break;

                case 6:

                    System.out.print(
                            "Nodo: ");

                    dato = sc.nextInt();

                    int prof =
                            arbol.profundidad(dato);

                    if (prof == -1)
                        System.out.println(
                                "Nodo no encontrado");
                    else
                        System.out.println(
                                "Profundidad: "
                                        + prof);

                    break;

                case 7:

                    System.out.println(
                            "Programa finalizado");

                    break;

                default:

                    System.out.println(
                            "Opcion invalida");
            }

        } while (opcion != 7);

        sc.close();
    }
}