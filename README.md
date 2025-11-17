# 📘 Taller de Ordenación en Java  
### **Autor:** Francis Valdiviezo  
### **Materia:** Estructura de Datos  
### **Carrera:** Computación – Tercer Ciclo  

---

## 📌 Descripción General

Este proyecto implementa y compara tres algoritmos clásicos de ordenación in-place en Java:

- **Inserción (Insertion Sort)**
- **Selección (Selection Sort)**
- **Burbuja (Bubble Sort)**

El objetivo es comprender cómo funciona cada método, analizar su comportamiento paso a paso y visualizar cómo evoluciona el arreglo durante el proceso de ordenamiento.

El programa también incluye una opción especial para **comparar los tres métodos simultáneamente**, mostrando trazas, gráficas verticales y tiempos de ejecución.

---

## 🧩 Características Principales del Proyecto

### ✔ Entrada por consola
El usuario ingresa un arreglo de enteros separados por espacio.

### ✔ Menú interactivo
El usuario puede elegir entre:
1. Inserción  
2. Selección  
3. Burbuja  
4. Comparación de los 3 métodos  
0. Salir  

### ✔ Trazas detalladas
Cada algoritmo muestra información precisa:
- Movimientos realizados (Inserción)
- Intercambios realizados (Selección)
- Pasadas reales del algoritmo (Burbuja con corte temprano)
- Gráfica vertical del arreglo en cada iteración

### ✔ Comparación global de algoritmos
La opción 4 ejecuta simultáneamente los tres métodos de ordenación y presenta:
- Trazas individuales  
- Resultados finales  
- Gráfica vertical final  
- **Tabla comparativa con tiempos en milisegundos**

### ✔ Casos borde manejados
El proyecto maneja correctamente:
- Arreglo vacío  
- Arreglo de tamaño 1  
- Arreglo ya ordenado  
- Arreglo en orden inverso  
- Elementos duplicados  

---

## 📊 Descripción de los Algoritmos

### 🔵 Inserción (Insertion Sort)

- Recorre los elementos desde el índice **1 hasta n−1**.  
- Inserta cada elemento en su posición correcta dentro del subarreglo ordenado.  
- Ideal para datos **casi ordenados**.  
- Las trazas muestran los elementos movidos y la posición donde se insertan.  

**Complejidad:**  
- Peor caso: **O(n²)**  
- Mejor caso: **O(n)**  

---

### 🟢 Selección (Selection Sort)

- Para cada posición `i` se busca el mínimo entre los elementos restantes.  
- Realiza un único **swap por iteración**, lo que reduce intercambios.  
- Las trazas muestran cada swap y un contador final.  

**Complejidad:**  
- Siempre: **O(n²)**

---

### 🔴 Burbuja (Bubble Sort)

- Compara elementos adyacentes e intercambia si están mal ordenados.  
- Implementa **corte temprano**, deteniéndose cuando no hay intercambios.  
- Las trazas muestran únicamente las pasadas donde ocurrió un cambio.  

**Complejidad:**  
- Peor caso: **O(n²)**  
- Mejor caso: **O(n)**

---

## 🧪 Casos de Prueba Utilizados

- A = `[8, 3, 6, 3, 9]`
- B = `[5, 4, 3, 2, 1]` (inverso)
- C = `[1, 2, 3, 4, 5]` (ordenado)
- D = `[2, 2, 2, 2]` (duplicados)
- E = `[9, 1, 8, 2]`

Todos los métodos producen los resultados esperados para cada dataset.

---

## 🧠 Conclusiones

- Los tres métodos ordenan correctamente todos los casos evaluados.  
- **Burbuja con corte temprano** puede ser muy eficiente en listas casi ordenadas.  
- **Selección** destaca por realizar muy pocos intercambios.  
- **Inserción** es ideal cuando la lista está parcialmente ordenada.  
- Las gráficas verticales facilitan comprender visualmente cómo avanza el proceso de ordenamiento.  
- El análisis comparativo permite evaluar de forma práctica rendimiento, estabilidad y complejidad.  

---

## ✨ Autor

**Francis Valdiviezo**  
Computación – Tercer Ciclo  
Universidad Nacional de Loja  
