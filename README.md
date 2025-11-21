# Taller de Ordenación y Comparaciones (Burbuja, Selección, Inserción)

## 📌 Descripción del Proyecto
Este proyecto forma parte del Taller de la asignatura **Estructura de Datos**, cuyo propósito es comparar el rendimiento de tres algoritmos de ordenación clásicos:

- **Burbuja (con corte temprano)**
- **Selección**
- **Inserción**

La comparación se realiza utilizando datasets reales en formato CSV, diseñados para simular diferentes situaciones: datos aleatorios, casi ordenados, duplicados y orden inverso.  
El objetivo es analizar cómo varía el rendimiento de cada algoritmo según la estructura del dataset, midiendo:

- **Comparaciones (comparisons)**
- **Intercambios (swaps)**
- **Tiempo de ejecución (ns / ms)**  

---

## 📂 Datasets Utilizados

### **1. citas.csv**
- 100 registros.
- Campos: `id`, `apellido`, `fechaHora`.
- Fechas generadas aleatoriamente entre 01/03/2025 y 31/03/2025 en horario laboral.
- Clave evaluada: **fechaHora**.

### **2. citas_casiOrdenadas.csv**
- Basado en el dataset anterior.
- Ordenado por `fechaHora` y alterado mediante **5 swaps**.
- Dataset ideal para estudiar el mejor caso de Inserción.

### **3. pacientes.csv**
- 500 pacientes con apellidos distribuidos de forma sesgada (60/30/10).
- Campos: `id`, `apellido`, `prioridad`.
- Muchos duplicados, ideal para probar estabilidad.
- Clave evaluada: **apellido**.

### **4. inventario_inverso.csv**
- 500 ítems ordenados de forma estrictamente descendente por stock (500 → 1).
- Campos: `id`, `insumo`, `stock`.
- Caso inverso perfecto, ideal para observar el peor caso de Burbuja e Inserción.
- Clave evaluada: **stock**.

---

## 🧠 Algoritmos Implementados

### 🔵 Burbuja (Bubble Sort) con corte temprano
- Compara elementos adyacentes.
- Intercambia según sea necesario.
- Si una pasada no hace swaps, termina.
- Peor caso: **O(n²)**  
- Mejor caso: **O(n)** (si está casi ordenado).

### 🟢 Inserción (Insertion Sort)
- Inserta cada elemento en una parte ya ordenada.
- Extremadamente eficiente cuando el dataset está parcialmente ordenado.
- Estable.
- Peor caso: **O(n²)**  
- Mejor caso: **O(n)**.

### 🟡 Selección (Selection Sort)
- Selecciona el mínimo elemento del rango restante.
- Hace siempre **n(n−1)/2 comparaciones**, independientemente del orden.
- Muy pocos swaps.
- No es estable.

---

## ⚙️ Funcionamiento General del Programa

El programa realiza las siguientes acciones:

1. **Carga un archivo CSV** utilizando un lector genérico.
2. Convierte los registros en objetos del tipo correspondiente (`Cita`, `Paciente`, `ProductoInventario`).
3. **Clona el dataset** para ejecutar los tres algoritmos bajo las mismas condiciones.
4. Ejecuta Burbuja, Selección e Inserción usando una **clave específica** dependiendo del dataset.
5. Mide:
   - Comparaciones  
   - Swaps  
   - Tiempo (nanosegundos y milisegundos)
6. Muestra los resultados en consola para su posterior análisis.

El programa permite repetir pruebas sobre cualquiera de los cuatro datasets proporcionados.

---

## 📊 Interpretación de Resultados

### ✔ **Dataset aleatorio (citas.csv)**
- Inserción obtiene buenos tiempos.
- Burbuja realiza más swaps.
- Selección mantiene sus comparaciones fijas (~5000).

### ✔ **Dataset casi ordenado (citas_casiOrdenadas.csv)**
- Inserción es el más rápido con mucha diferencia.
- Burbuja se beneficia del corte temprano.
- Selección no mejora ni empeora.

### ✔ **Dataset con duplicados (pacientes.csv)**
- Inserción detecta orden local y reduce comparaciones.
- Selección es constante y hace pocos swaps.
- Burbuja es el más lento.

### ✔ **Dataset inverso (inventario_inverso.csv)**
- Selección es el más eficiente.
- Burbuja e Inserción ejecutan su peor caso.
- Burbuja realiza un número masivo de swaps.

---

## 🧾 Conclusiones Generales

- **Inserción** es el algoritmo más conveniente cuando los datos están casi ordenados o contienen duplicados.
- **Selección** mantiene un rendimiento estable sin importar el orden del dataset, ideal cuando solo importan comparaciones y se desea minimizar swaps.
- **Burbuja**, aunque simple, generalmente es el menos eficiente salvo en casos casi ordenados.
- El tipo de dataset influye directamente en el rendimiento, lo cual demuestra que no existe un algoritmo “universalmente mejor”, sino uno adecuado según el escenario.

---

## 🤖 Uso Ético de Inteligencia Artificial

El desarrollo de este proyecto incluyó asistencia de IA bajo los siguientes principios:

- La IA se utilizó como **herramienta de apoyo**, no como reemplazo del aprendizaje.
- Todas las partes del código fueron **comprendidas, verificadas y adaptadas** manualmente.
- No se utilizó IA para falsificar resultados o evadir razonamiento propio.
- Se cumplieron estrictamente los lineamientos de integridad académica.
- El uso de IA contribuyó únicamente a mejorar la calidad de documentación y eficiencia en la implementación.

---

## 🙌 Autor
Proyecto desarrollado por **Francis Valdiviezo**,  **Derick Vargas**
Estudiante de la Carrera de Computación – FEIRNNR – UNL.
