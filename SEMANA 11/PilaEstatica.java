/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

public class PilaEstatica {

    private int[] pila;
    private int cima;

    public PilaEstatica(int tamaño) {
        pila = new int[tamaño];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == pila.length - 1;
    }

    public void push(int dato) {
        if (estaLlena()) {
            System.out.println("La pila está llena.");
            return;
        }

        pila[++cima] = dato;
        System.out.println("Elemento agregado.");
    }

    public int pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return -1;
        }

        return pila[cima--];
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Contenido de la pila:");

        for (int i = cima; i >= 0; i--) {
            System.out.println(pila[i]);
        }
    }
}