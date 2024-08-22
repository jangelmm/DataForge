package test;

import com.jangelmm.dataforge.list.ForgeDual;


public class TestForgeDual {
    public static void main(String[] args) {
        // Crear una lista doblemente enlazada de enteros
        ForgeDual<Integer> list = new ForgeDual<>();

        // Insertar elementos al inicio de la lista
        list.insertAtStart(3);
        list.insertAtStart(2);
        list.insertAtStart(1);

        // Insertar elementos al final de la lista
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        // Insertar un elemento después de un elemento específico
        list.insertAfter(2, 1); // Insertar 2 después de 1

        // Insertar un elemento antes de un elemento específico
        list.insertBefore(0, 1); // Insertar 0 antes de 1

        // Imprimir la lista en orden ascendente
        System.out.println("Lista en orden ascendente:");
        list.printListAscending();

        // Remover elementos
        System.out.println("\nRemoviendo la cabeza (primer elemento): " + list.removeHead());
        System.out.println("Removiendo la cola (último elemento): " + list.removeTail());
        System.out.println("Removiendo el elemento 2: " + list.removeElement(2));

        // Imprimir la lista después de las operaciones de eliminación
        System.out.println("\nLista después de las eliminaciones:");
        list.printListAscending();
    }
}
