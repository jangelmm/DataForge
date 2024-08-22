
package test;

import com.jangelmm.dataforge.tree.ForgeBinaryTree;

public class TestForgeBinaryTree {
    public static void main(String[] args) {
        ForgeBinaryTree<String> tree = new ForgeBinaryTree<>();

        // Agregar elementos al árbol
        tree.add("50");
        tree.add("30");
        tree.add("20");
        tree.add("40");
        tree.add("70");
        tree.add("60");
        tree.add("80");

        tree.printTree();
        tree.printGraphicalTree();
        
        // Realizar recorridos
        System.out.println("Recorrido en orden:");
        tree.inOrderTraversal();
        System.out.println("\nRecorrido en preorden:");
        tree.preOrderTraversal();
        System.out.println("\nRecorrido en postorden:");
        tree.postOrderTraversal();

        // Buscar elementos en el árbol
        System.out.println("\n\nBuscar 40: " + tree.contains("40")); // true
        System.out.println("Buscar 25: " + tree.contains("25")); // false

        // Contar nodos, hojas y padres
        System.out.println("\nNúmero de nodos: " + tree.countNodes());
        System.out.println("Número de hojas: " + tree.countLeaves());
        System.out.println("Número de padres: " + tree.countParents());

        // Eliminar un elemento del árbol
        System.out.println("\nEliminar 20:");
        tree.remove("20");
        System.out.println("Recorrido en orden después de eliminar 20:");
        tree.inOrderTraversal();

        // Limpiar el árbol
        tree.clear();
        System.out.println("\nÁrbol después de limpiar:");
        tree.inOrderTraversal(); // No debería imprimir nada
    }
}
