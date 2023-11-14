import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOriginal = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array Original: " + Arrays.toString(arrayOriginal));

        System.out.println("\nBubble Sort:");
        int[] arrayOrdenadoBubble = BubbleSort.ordenar(Arrays.copyOf(arrayOriginal, arrayOriginal.length));
        System.out.println("Array Ordenado: " + Arrays.toString(arrayOrdenadoBubble));

        System.out.println("\nInsertion Sort:");
        int[] arrayOrdenadoInsertion = InsertionSort.ordenar(Arrays.copyOf(arrayOriginal, arrayOriginal.length));
        System.out.println("Array Ordenado: " + Arrays.toString(arrayOrdenadoInsertion));

        System.out.println("\nQuick Sort:");
        int[] arrayOrdenadoQuick = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        QuickSort.ordenar(arrayOrdenadoQuick);
        System.out.println("Array Ordenado: " + Arrays.toString(arrayOrdenadoQuick));
    }
}
