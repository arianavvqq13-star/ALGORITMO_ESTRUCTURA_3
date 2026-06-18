
package Libreria;

public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar nodo
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private NodoArbol insertarRecursivo(NodoArbol nodo, int dato) {

        if (nodo == null) {
            return new NodoArbol(dato);
        }

        if (dato < nodo.dato) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, dato);
        } else {
            nodo.derecha = insertarRecursivo(nodo.derecha, dato);
        }

        return nodo;
    }

    // PREORDEN
    public void preorden() {
        System.out.print("Preorden: ");
        preordenRecursivo(raiz);
        System.out.println();
    }

    private void preordenRecursivo(NodoArbol nodo) {

        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preordenRecursivo(nodo.izquierda);
            preordenRecursivo(nodo.derecha);
        }
    }

    // INORDEN
    public void inorden() {
        System.out.print("Inorden: ");
        inordenRecursivo(raiz);
        System.out.println();
    }

    private void inordenRecursivo(NodoArbol nodo) {

        if (nodo != null) {
            inordenRecursivo(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inordenRecursivo(nodo.derecha);
        }
    }

    // POSTORDEN
    public void postorden() {
        System.out.print("Postorden: ");
        postordenRecursivo(raiz);
        System.out.println();
    }

    private void postordenRecursivo(NodoArbol nodo) {

        if (nodo != null) {
            postordenRecursivo(nodo.izquierda);
            postordenRecursivo(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }
}