package test;

import com.jangelmm.dataforge.tree.ForgeAVLTree;
import com.jangelmm.dataforge.tree.NodeAVL;


/**
 * Main class to demonstrate the functionality of the ForgeAVLTree.
 */
public class TestForgeAVLTree {
    public static void main(String[] args) {
        ForgeAVLTree<String, String> avl = new ForgeAVLTree<>();
        avl.insert("AA", "value9");
        avl.insert("AB", "value15");
        avl.insert("CD", "value5");
        avl.insert("ZX", "value6");
        avl.insert("DS", "value17");
        avl.insert("7A", "value7");
        avl.insert("F3", "value1");
        
        avl.printTree();
        avl.printGraphicalTree();

        System.out.println("Pre-order traversal:");
        avl.preOrderTraversal();

        System.out.println("\nIn-order traversal:");
        avl.inOrderTraversal();

        System.out.println("\nPost-order traversal:");
        avl.postOrderTraversal();

        System.out.println("\nSearching for key 17:");
        NodeAVL<String, String> node = avl.search("17");
        System.out.println(node != null ? "Key found: " + node.getKey() : "Key not found");

        System.out.println("\nSize of the tree: " + avl.size());

        System.out.println("\nDeleting key 6:");
        avl.delete("6", 0);
        avl.inOrderTraversal();
    }
}