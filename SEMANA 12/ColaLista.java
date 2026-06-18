
package Libreria;

public class ColaLista {
    private Nodo frente;
    private Nodo fin;

    public ColaLista() {
        frente = null;
        fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public int dequeue() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return -1;
        }

        int dato = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return dato;
    }

    public void mostrar() {
        Nodo aux = frente;

        System.out.print("Cola: ");

        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.siguiente;
        }

        System.out.println();
    }
}