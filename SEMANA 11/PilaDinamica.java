/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

public class PilaDinamica {

    private Nodo cima;

    public PilaDinamica() {
        cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);

        nuevo.siguiente = cima;
        cima = nuevo;

        System.out.println("Elemento agregado.");
    }

    public int pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return -1;
        }

        int dato = cima.dato;
        cima = cima.siguiente;

        return dato;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }

        Nodo aux = cima;

        System.out.println("Contenido de la pila:");

        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }
}