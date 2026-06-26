package Libreria;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // INSERTAR
    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo actual, int dato) {

        if (actual == null)
            return new Nodo(dato);

        if (dato < actual.dato)
            actual.izquierdo = insertarRec(actual.izquierdo, dato);

        else if (dato > actual.dato)
            actual.derecho = insertarRec(actual.derecho, dato);

        return actual;
    }

    // BUSCAR
    public boolean buscar(int dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(Nodo actual, int dato) {

        if (actual == null)
            return false;

        if (actual.dato == dato)
            return true;

        if (dato < actual.dato)
            return buscarRec(actual.izquierdo, dato);

        return buscarRec(actual.derecho, dato);
    }

    // ELIMINAR
    public void eliminar(int dato) {
        raiz = eliminarRec(raiz, dato);
    }

    private Nodo eliminarRec(Nodo actual, int dato) {

        if (actual == null)
            return null;

        if (dato < actual.dato)
            actual.izquierdo = eliminarRec(actual.izquierdo, dato);

        else if (dato > actual.dato)
            actual.derecho = eliminarRec(actual.derecho, dato);

        else {

            // Caso 1: nodo hoja
            if (actual.izquierdo == null &&
                actual.derecho == null)
                return null;

            // Caso 2: un hijo
            if (actual.izquierdo == null)
                return actual.derecho;

            if (actual.derecho == null)
                return actual.izquierdo;

            // Caso 3: dos hijos
            Nodo sucesor = obtenerMinimo(actual.derecho);

            actual.dato = sucesor.dato;

            actual.derecho =
                    eliminarRec(actual.derecho,
                            sucesor.dato);
        }

        return actual;
    }

    private Nodo obtenerMinimo(Nodo nodo) {

        while (nodo.izquierdo != null)
            nodo = nodo.izquierdo;

        return nodo;
    }

    // ALTURA
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Nodo actual) {

        if (actual == null)
            return -1;

        int izquierda =
                alturaRec(actual.izquierdo);

        int derecha =
                alturaRec(actual.derecho);

        return Math.max(izquierda,
                derecha) + 1;
    }

    // PROFUNDIDAD
    public int profundidad(int dato) {
        return profundidadRec(raiz,
                dato,
                0);
    }

    private int profundidadRec(Nodo actual,
                               int dato,
                               int nivel) {

        if (actual == null)
            return -1;

        if (actual.dato == dato)
            return nivel;

        if (dato < actual.dato)
            return profundidadRec(
                    actual.izquierdo,
                    dato,
                    nivel + 1);

        return profundidadRec(
                actual.derecho,
                dato,
                nivel + 1);
    }

    // RECORRIDO INORDEN
    public void mostrar() {

        if (raiz == null) {
            System.out.println("Arbol vacio");
            return;
        }

        inOrden(raiz);
        System.out.println();
    }

    private void inOrden(Nodo actual) {

        if (actual != null) {

            inOrden(actual.izquierdo);

            System.out.print(
                    actual.dato + " ");

            inOrden(actual.derecho);
        }
    }
}