import java.util.Arrays;

public class Quicsort {
     public static void quicksort(int[] array, int inicio, int fim) {
            if (inicio < fim) {
                int indicePivo = particionar(array, inicio, fim);
                quicksort(array, inicio, indicePivo - 1);
                quicksort(array, indicePivo + 1, fim);
            }
        }

        private static int particionar(int[] array, int inicio, int fim) {
            int pivô = array[fim];
            int i = inicio - 1;

            for (int j = inicio; j < fim; j++) {
                if (array[j] < pivô) {
                    i++;
                    trocar(array, i, j);
                }
            }

            trocar(array, i + 1, fim);
            return i + 1;
        }

        private static void trocar(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void main(String[] args) {

            int[] array = {10, 5, 8, 3, 6, 9, 1, 2};
            quicksort(array, 0, array.length - 1);
            System.out.println(Arrays.toString(array));
        }
}
