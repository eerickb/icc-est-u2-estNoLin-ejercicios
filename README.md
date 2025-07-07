# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Erick Bermeo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```

3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---

## Explicación para el estudiante

```
src/
│
├── Materia/
│   ├── Models/
│   └── Controllers/
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

📂 Carpeta: `Ejercicio_01_insert`
**Método:** `insert(Node root, int value): Node`
**Explicación:** Se recorre recursivamente el árbol y se inserta el nodo en la posición adecuada respetando las reglas del BST: si el valor es menor, va a la izquierda; si es mayor, a la derecha. Si el nodo actual es `null`, se crea uno nuevo.

 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado (estructura):**
```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
**Método:** `invertTree(Node root): Node`
**Explicación:** Se realiza una función recursiva que intercambia los hijos izquierdo y derecho de cada nodo, logrando una versión "espejo" del árbol original.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
**Método:** `listLevels(Node root): List<List<Node>>`
**Explicación:** Utiliza una cola para hacer un recorrido BFS (por anchura), agrupando los nodos por nivel en listas separadas. Cada lista representa los nodos en un mismo nivel.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
Nivel 1: 4 → null
Nivel 2: 2 → 7 → null
Nivel 3: 1 → 3 → 6 → 9 → null
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

📂 Carpeta: `Ejercicio_04_depth`
**Método:** `maxDepth(Node root): int`
**Explicación:** Se calcula la profundidad de forma recursiva. Por cada nodo, se obtiene la profundidad de su subárbol izquierdo y derecho, y se retorna el mayor entre ambos más uno.

**Input de ejemplo:**

```
    4
  2   7
1  3
8
```

**Output esperado:** `4`

---

## Informe de desarrollo de los métodos

A continuación se detalla la lógica aplicada en cada uno de los métodos implementados para cumplir con los ejercicios propuestos:

### Método: `insert(Node root, int value)`
Este método se encarga de insertar un valor en el árbol respetando las propiedades de un BST. Si el nodo actual es `null`, se crea uno nuevo. Si el valor es menor que el del nodo actual, se inserta a la izquierda; si es mayor, a la derecha. No se permiten duplicados. Se utiliza recursividad para encontrar la posición adecuada.

### Método: `invertTree(Node root)`
Este método recorre el árbol en profundidad (DFS) e intercambia los hijos izquierdo y derecho de cada nodo, produciendo una versión invertida o reflejada del árbol original. Se usa recursión para recorrer todos los nodos y aplicar la inversión desde las hojas hacia la raíz.

### Método: `listLevels(Node root)`
Este método implementa un recorrido por niveles (BFS) utilizando una cola. En cada iteración del ciclo externo se determina cuántos nodos hay en el nivel actual (`size` de la cola), se procesan esos nodos y se agregan sus hijos a la cola. Cada nivel se almacena en una lista de nodos, y todas las listas se almacenan en una lista general.

### Método: `maxDepth(Node root)`
Este método calcula la profundidad máxima de un árbol binario de forma recursiva. Para cada nodo se calcula la profundidad de su subárbol izquierdo y derecho, y se retorna el máximo entre ambas más uno. Este método mide la cantidad de niveles desde la raíz hasta la hoja más profunda.

---

## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

```
Estructuras No Lineales – Ejercicios Árboles
```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |

---

## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

---

## Autores

- [PABLO TORRES] - Desarrollo inicial
- [ERICK BERMEO] - Desarrollo del proyecto y resolución de ejercicios