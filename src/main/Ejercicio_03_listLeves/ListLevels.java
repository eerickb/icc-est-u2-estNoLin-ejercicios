package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;
import java.util.*;

public class ListLevels {
    public List<List<Node>> listLevels(Node raiz) {
        List<List<Node>> res = new ArrayList<>();
        if (raiz == null) return res;
        Queue<Node> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            int tam = cola.size();
            List<Node> nivel = new ArrayList<>();
            for (int i = 0; i < tam; i++) {
                Node actual = cola.poll();
                nivel.add(actual);
                if (actual.getLeft() != null) cola.add(actual.getLeft());
                if (actual.getRight() != null) cola.add(actual.getRight());
            }
            res.add(nivel);
        }
        return res;
    }
}