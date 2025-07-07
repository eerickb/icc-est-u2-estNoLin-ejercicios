package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
    public int maxDepth(Node nodo) {
        if (nodo == null) return 0;
        int izq = maxDepth(nodo.getLeft());
        int der = maxDepth(nodo.getRight());
        return 1 + Math.max(izq, der);
    }
}