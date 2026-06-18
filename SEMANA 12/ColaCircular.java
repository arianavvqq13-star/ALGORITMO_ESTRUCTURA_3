
package Libreria;

public class ColaCircular {
    private int[] cola;
    private int frente;
    private int fin;
    private int capacidad;
    private int tamaño;

    public ColaCircular(int capacidad) {
        this.capacidad = capacidad;
        cola = new int[capacidad];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public boolean estaLlena() {
        return tamaño == capacidad;
    }

    public void enqueue(int dato) {
        if (estaLlena()) {
            System.out.println("Cola llena");
            return;
        }

        fin = (fin + 1) % capacidad;
        cola[fin] = dato;
        tamaño++;
    }

    public int dequeue() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return -1;
        }

        int dato = cola[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;

        return dato;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }

        System.out.print("Cola: ");

        for (int i = 0; i < tamaño; i++) {
            System.out.print(
                cola[(frente + i) % capacidad] + " "
            );
        }
        System.out.println();
    }
}