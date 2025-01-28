/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoble;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenido a las Listas Dobles!!");
            ListaDobleEnlazada lista = new ListaDobleEnlazada();
            int opcion;
            
            do {
                System.out.println("\n===== Menú Lista Doblemente Enlazada =====");
                System.out.println("1. Agregar nodo al inicio");
                System.out.println("2. Agregar nodo al final");
                System.out.println("3. Eliminar un nodo");
                System.out.println("4. Mostrar tamaño de la lista");
                System.out.println("5. Mostrar lista desde el inicio");
                System.out.println("6. Mostrar lista desde el final");
                System.out.println("7. Salir");
                System.out.print("Elige una opción: ");
                
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el valor del nodo a agregar al inicio: ");
                        int valorInicio = scanner.nextInt();
                        lista.insertarAlInicio(valorInicio);
                        break;
                    case 2:
                        System.out.print("Ingresa el valor del nodo a agregar al final: ");
                        int valorFinal = scanner.nextInt();
                        lista.insertarAlFinal(valorFinal);
                        break;
                    case 3:
                        System.out.print("Ingresa el valor del nodo a eliminar: ");
                        int valorEliminar = scanner.nextInt();
                        lista.eliminar(valorEliminar);
                        break;
                    case 4:
                        System.out.println("El tamaño actual de la lista es: " + lista.getTamaño());
                        break;
                    case 5:
                        lista.mostrarDesdeInicio();
                        break;
                    case 6:
                        lista.mostrarDesdeFinal();
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }
            } while (opcion != 7);
        }
    }
       
    }   // TODO code application logic here
    
    

