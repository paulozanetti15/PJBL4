# Trabalho de Algoritmos de Ordenação em Java

Este projeto contém implementações dos algoritmos de ordenação **Bubble Sort**, **Insertion Sort** e **Quick Sort** em Java. Cada algoritmo está em uma classe separada, e há uma classe principal (`Main.java`) que realiza testes e imprime os arrays durante cada iteração de ordenação.

## Resultados

- O array original é: `[49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28]`
- Cada algoritmo imprime o array durante cada iteração e, no final, imprime o array ordenado.

## Algoritmos de Ordenação Implementados

### Bubble Sort
- **Implementação:** `BubbleSort.java`
- **Descrição:**
    1. Percorre a lista comparando elementos adjacentes.
    2. Troca os elementos se estiverem na ordem errada.
    3. Repete até que a lista esteja totalmente ordenada.
- **Exemplo com o Array:**
    ```
    Passo 1: [15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28, 49]
    Passo 2: [15, 27, 20, 19, 40, 2, 12, 28, 49, 44, 9, 50, 18, 5, 30, 6, 7, 28, 49, 59]
    Passo 3: [15, 20, 19, 27, 2, 12, 28, 40, 44, 9, 49, 18, 5, 30, 6, 7, 28, 49, 50, 59]
    ```

### Insertion Sort
- **Implementação:** `InsertionSort.java`
- **Descrição:**
    1. Constrói uma sequência ordenada pegando um elemento da lista.
    2. Insere o elemento na posição correta.
    3. Repete até que toda a lista esteja ordenada.
- **Exemplo com o Array:**
    ```
    Passo 1: [15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28, 49]
    Passo 2: [15, 27, 20, 19, 40, 2, 12, 28, 49, 44, 9, 50, 18, 5, 30, 6, 7, 28, 49, 59]
    Passo 3: [15, 19, 20, 27, 2, 12, 28, 40, 44, 9, 49, 18, 5, 30, 6, 7, 28, 49, 50, 59]
    ```

### Quick Sort
- **Implementação:** `QuickSort.java`
- **Descrição:**
    1. Escolhe um elemento como pivô.
    2. Particiona o array ao redor do pivô.
    3. Repete o processo recursivamente até que todo o array esteja ordenado.
- **Exemplo com o Array:**
    ```
    Passo 1: [15, 40, 27, 20, 19, 2, 12, 28, 44, 9, 18, 5, 30, 6, 7, 28, 49, 50, 59, 49]
    Passo 2: [15, 12, 9, 5, 6, 7, 19, 2, 40, 44, 28, 18, 30, 20, 27, 28, 49, 50, 59, 49]
    Passo 3: [5, 2, 6, 7, 9, 12, 15, 19, 40, 44, 28, 18, 30, 20, 27, 28, 49, 50, 59, 49]
    ```
