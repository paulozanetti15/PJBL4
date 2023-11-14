import java.util.Arrays;

// Conforme solicitado, o pivô utilizado é o primeiro elemento do array


public class QuickSort {
    public static int[] ordenar(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSort(int[] arr, int baixo, int alto) {
        if (baixo < alto) {
            // Escolha do pivô
            int pi = particionar(arr, baixo, alto);

            quickSort(arr, baixo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    private static int particionar(int[] arr, int baixo, int alto) {
        int pivô = arr[baixo];
        int esquerda = baixo + 1;
        int direita = alto;
        boolean feito = false;

        while (!feito) {
            while (esquerda <= direita && arr[esquerda] <= pivô) {
                esquerda = esquerda + 1;
            }

            while (arr[direita] >= pivô && direita >= esquerda) {
                direita = direita - 1;
            }

            if (direita < esquerda) {
                feito = true;
            } else {
                int temp = arr[esquerda];
                arr[esquerda] = arr[direita];
                arr[direita] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }

        int temp = arr[baixo];
        arr[baixo] = arr[direita];
        arr[direita] = temp;

        return direita;
    }
}
