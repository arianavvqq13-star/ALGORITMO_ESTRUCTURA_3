
package Libreria;

public class ColaPrioridad {
    private int[] cola;
    private int tamaño;

    public ColaPrioridad(int capacidad) {
        cola = new int[capacidad];
        tamaño = 0;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public void enqueue(int dato) {
        if (tamaño == cola.length) {
            System.out.println("Cola llena");
            return;
        }

        cola[tamaño++] = dato;
    }

    public int dequeue() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return -1;
        }

        int indicePrioridad = 0;

        for (int i = 1; i < tamaño; i++) {
            if (cola[i] < cola[indicePrioridad]) {
                indicePrioridad = i;
            }
        }

        int dato = cola[indicePrioridad];

        for (int i = indicePrioridad; i < tamaño - 1; i++) {
            cola[i] = cola[i + 1];
        }

        tamaño--;

        return dato;
    }

    public void mostrar() {
        System.out.print("Cola: ");

        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[i] + " ");
        }

        System.out.println();
    }
}