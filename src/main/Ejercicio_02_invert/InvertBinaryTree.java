package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node nodo) {
        if (nodo == null) return null;
        Node izq = invertTree(nodo.getRight());
        Node der = invertTree(nodo.getLeft());
        nodo.setLeft(izq);
        nodo.setRight(der);
        return nodo;
    }

    public void mostrarInOrden(Node nodo) {
        if (nodo != null) {
            mostrarInOrden(nodo.getLeft());
            System.out.print(nodo.getValue() + " ");
            mostrarInOrden(nodo.getRight());
        }
    }
}
