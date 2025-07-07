package main;

import utils.StudentValidator;

import main.Materia.Models.Node;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        // Insertar en BST
        System.out.println("\n===== Ejercicio 01: Insertar en BST =====");
        ArbolBinario bst = new ArbolBinario();
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for (int v : valores) {
            bst.insert(v);
        }
        System.out.println("Árbol generado:");
        bst.printTree();

        // Invertir árbol
        System.out.println("\n===== Ejercicio 02: Invertir Árbol Binario =====");
        Node invertido = invertir(bst.getRoot());
        System.out.println("Árbol invertido (inorden):");
        ArbolRecorridos recorridos = new ArbolRecorridos();
        recorridos.inOrderTraversal(invertido);
        System.out.println();

        // Listar niveles
        System.out.println("\n===== Ejercicio 03: Listar Niveles del Árbol =====");
        listarNiveles(invertido);

        // Profundidad máxima
        System.out.println("\n===== Ejercicio 04: Calcular Profundidad Máxima =====");
        int prof = profundidadMaxima(invertido);
        System.out.println("Profundidad del árbol: " + prof);
    }

    // Método para invertir un árbol binario
    public static Node invertir(Node nodo) {
        if (nodo == null) return null;
        Node izq = invertir(nodo.getRight());
        Node der = invertir(nodo.getLeft());
        nodo.setLeft(izq);
        nodo.setRight(der);
        return nodo;
    }

    // Método para listar niveles del árbol
    public static void listarNiveles(Node raiz) {
        if (raiz == null) return;
        Queue<Node> cola = new LinkedList<>();
        cola.add(raiz);
        int nivel = 1;

        while (!cola.isEmpty()) {
            int tam = cola.size();
            System.out.print("Nivel " + nivel + ": ");
            for (int i = 0; i < tam; i++) {
                Node actual = cola.poll();
                System.out.print(actual.getValue() + " -> ");
                if (actual.getLeft() != null) cola.add(actual.getLeft());
                if (actual.getRight() != null) cola.add(actual.getRight());
            }
            System.out.println("null");
            nivel++;
        }
    }

    // Método para calcular profundidad máxima
    public static int profundidadMaxima(Node nodo) {
        if (nodo == null) return 0;
        int izq = profundidadMaxima(nodo.getLeft());
        int der = profundidadMaxima(nodo.getRight());
        return 1 + Math.max(izq, der);
    }
}
