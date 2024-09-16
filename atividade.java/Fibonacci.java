import java.util.Arrays;

public class Fibonacci {
     public static int[] fibonacci(int n) {
            int[] sequencia = new int[n];
            sequencia[0] = 0;
            sequencia[1] = 1;

            for (int i = 2; i < n; i++) {
                sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
            }

            return sequencia;
        }

        public static void main(String[] args) {

            System.out.println(Arrays.toString(fibonacci(10)));

    }
}
