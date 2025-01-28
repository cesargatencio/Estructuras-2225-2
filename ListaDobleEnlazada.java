/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author cesar
 */
public class ListaDobleEnlazada {
     private Nodo cabeza; //Nodo inicial/
    private Nodo cola;   //Nodo final/
    private int tamaño;  // Atributo para almacenar el tamaño de la lista

    //constructor//
    public ListaDobleEnlazada() {
        System.out.println("Lista en construccion!");
        this.cabeza = null;
        this.cola = null;
        this.tamaño = 0;
    }
     // Insertar al inicio de la lista
    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        tamaño++;  // Incrementar tamaño
    }

    // Insertar al final de la lista
    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cola == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        tamaño++;  // Incrementar tamaño
    }

    // Eliminar un nodo con un valor específico
    public void eliminar(int dato) {
        if (cabeza == null) return;  // Lista vacía

        Nodo actual = cabeza;

        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual == null) return; // No encontrado

        if (actual == cabeza) {  // Si es el primer nodo
            cabeza = cabeza.siguiente;
            if (cabeza != null) {
                cabeza.anterior = null;
            }
        } else if (actual == cola) {  // Si es el último nodo
            cola = cola.anterior;
            if (cola != null) {
                cola.siguiente = null;
            }
        } else {  // Nodo en medio
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }

        tamaño--;  // Decrementar tamaño
    }

    // Obtener el tamaño actual de la lista
    public int getTamaño() {
        return tamaño;
    }

    // Mostrar la lista desde el inicio
    public void mostrarDesdeInicio() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " - ");
            actual = actual.siguiente;
        }
        System.out.println("//");
    }

    // Mostrar la lista desde el final
    public void mostrarDesdeFinal() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " - ");
            actual = actual.anterior;
        }
        System.out.println("//");
    }
}


